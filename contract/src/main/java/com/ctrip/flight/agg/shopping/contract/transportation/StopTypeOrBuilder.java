// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface StopTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.StopType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 机场Code
   * </pre>
   *
   * <code>string AirportCode = 1;</code>
   */
  java.lang.String getAirportCode();
  /**
   * <pre>
   * 机场Code
   * </pre>
   *
   * <code>string AirportCode = 1;</code>
   */
  com.google.protobuf.ByteString
      getAirportCodeBytes();

  /**
   * <pre>
   * 耗时间隔，单位分钟
   * </pre>
   *
   * <code>int32 DurationMinutes = 2;</code>
   */
  int getDurationMinutes();

  /**
   * <pre>
   * 到达时间, format: yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string ArriveDateTime = 3;</code>
   */
  java.lang.String getArriveDateTime();
  /**
   * <pre>
   * 到达时间, format: yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string ArriveDateTime = 3;</code>
   */
  com.google.protobuf.ByteString
      getArriveDateTimeBytes();
}
