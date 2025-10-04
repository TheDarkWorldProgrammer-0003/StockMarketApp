package com.plcoding.stockmarketapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

// Dao is used to access the database

@Dao
interface StockDao {

    // Anotation insert is used to insert data into the database

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    // suspend is used to run the function in a separate thread
    suspend fun insertCompanyListings(
        companyListingEntities: List<CompanyListingEntity>
    )

    @Query("DELETE FROM company_listings")
    suspend fun clearCompanyListings()

    @Query("""
        SELECT * 
        FROM company_listings
        WHERE LOWER(name) LIKE '%' || LOWER(:query) || '%' OR
            UPPER(:query) == symbol
    """)

    suspend fun searchCompanyListings(query: String): List<CompanyListingEntity>

}