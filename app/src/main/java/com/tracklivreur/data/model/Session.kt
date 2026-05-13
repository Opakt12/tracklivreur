package com.tracklivreur.data.model

data class Session(
    val id: String,
    val token: String,
    val merchantId: String,
    val driverDeviceId: String? = null,
    val status: SessionStatus,
    val pickupLat: Double,
    val pickupLng: Double,
    val dropoffLat: Double,
    val dropoffLng: Double,
    val createdAt: Long,
    val startedAt: Long? = null,
    val completedAt: Long? = null,
    val fraudScore: Int = 0
)

enum class SessionStatus {
    PENDING,
    ACTIVE,
    SUSPICIOUS,
    COMPLETED
}