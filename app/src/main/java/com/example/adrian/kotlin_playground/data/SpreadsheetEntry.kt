package com.example.adrian.kotlin_playground.data

import java.sql.Timestamp
import java.util.*

/**
 * Created by Adrian Muntean (adrian.muntean@tora.com).
 */
data class SpreadsheetEntry(val timestamp: Timestamp, val date: Date, val spending: Float,
                            val details: String, val purpose: Purpose)