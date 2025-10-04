package com.plcoding.stockmarketapp.domain.model
// it has nothing to with any third party library
// just plain kotlin class ; used only to show UI like company listings
data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String

)
