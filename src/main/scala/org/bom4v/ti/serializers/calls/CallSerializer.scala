package org.bom4v.ti.serializers.calls

import org.apache.spark.sql.types.{StructType,StructField,StringType,IntegerType,DoubleType,TimestampType,DateType}

/**
 * CallEvent
 */
object CallEvent {

  /**
    * Header:
    *  specificationVersionNumber
    *  releaseVersionNumber
    *  fileName
    *  fileAvailableTimeStamp
    *  fileUtcTimeOffset
    *  sender
    *  recipient
    *  sequenceNumber
    *  callEventsCount
    *  eventType
    *  imsi
    *  imei
    *  callEventStartTimeStamp
    *  utcTimeOffset
    *  callEventDuration
    *  causeForTermination
    *  accessPointNameNI
    *  accessPointNameOI
    *  dataVolumeIncoming
    *  dataVolumeOutgoing
    *  sgsnAddress
    *  ggsnAddress
    *  chargingId
    *  chargeAmount
    *  teleServiceCode
    *  bearerServiceCode
    *  supplementaryServiceCode
    *  dialledDigits
    *  connectedNumber
    *  thirdPartyNumber
    *  callingNumber
    *  recEntityId
    *  callReference
    *  locationArea
    *  cellId
    *  msisdn
    *  servingNetwork
    */
  val callEventSchema =
    StructType (
      Array (
        StructField("specificationVersionNumber", IntegerType, true),
        StructField("releaseVersionNumber", IntegerType, true),
        StructField("fileName", StringType, true),
        StructField("fileAvailableTimeStamp", TimestampType, true),
        StructField("fileUtcTimeOffset", IntegerType, true),
        StructField("sender", StringType, true),
        StructField("recipient", StringType, true),
        StructField("sequenceNumber", IntegerType, true),
        StructField("callEventsCount", StringType, true),
        StructField("eventType", DoubleType, true),
        StructField("imsi", IntegerType, true),
        StructField("imei", IntegerType, true),
        StructField("callEventStartTimeStamp", StringType, true),
        StructField("utcTimeOffset", IntegerType, true),
        StructField("callEventDuration", DoubleType, true),
        StructField("causeForTermination", IntegerType, true),
        StructField("accessPointNameNI", IntegerType, true),
        StructField("accessPointNameOI", IntegerType, true),
        StructField("dataVolumeIncoming", IntegerType, true),
        StructField("dataVolumeOutgoing", IntegerType, true),
        StructField("sgsnAddress", StringType, true),
        StructField("ggsnAddress", DoubleType, true),
        StructField("chargingId", StringType, true),
        StructField("chargeAmount", DoubleType, true),
        StructField("teleServiceCode", IntegerType, true),
        StructField("bearerServiceCode", StringType, true),
        StructField("supplementaryServiceCode", StringType, true),
        StructField("dialledDigits", StringType, true),
        StructField("connectedNumber", StringType, true),
        StructField("thirdPartyNumber", StringType, true),
        StructField("callingNumber", StringType, true),
        StructField("recEntityId", StringType, true),
        StructField("callReference", StringType, true),
        StructField("locationArea", StringType, true),
        StructField("cellId", StringType, true),
        StructField("msisdn", StringType, true),
        StructField("servingNetwork", StringType, true)
      )
    )
}
