// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

public interface SpecifiedJourneyOptionTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.request.SpecifiedJourneyOptionType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 JourneyNo = 1;</code>
   */
  int getJourneyNo();

  /**
   * <code>int32 SegmentNo = 2;</code>
   */
  int getSegmentNo();

  /**
   * <pre>
   * 交通工具类型，1-flight; 2-train; 4-bus
   * </pre>
   *
   * <code>int32 TransportType = 3;</code>
   */
  int getTransportType();

  /**
   * <pre>
   * 交通号. e.g: FM1234
   * </pre>
   *
   * <code>string TransportNo = 4;</code>
   */
  java.lang.String getTransportNo();
  /**
   * <pre>
   * 交通号. e.g: FM1234
   * </pre>
   *
   * <code>string TransportNo = 4;</code>
   */
  com.google.protobuf.ByteString
      getTransportNoBytes();

  /**
   * <pre>
   * 飞机交通类型具体指定信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.FlightSpecifiedOptionType FlightSpecifiedOption = 5;</code>
   */
  boolean hasFlightSpecifiedOption();
  /**
   * <pre>
   * 飞机交通类型具体指定信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.FlightSpecifiedOptionType FlightSpecifiedOption = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.FlightSpecifiedOptionType getFlightSpecifiedOption();
  /**
   * <pre>
   * 飞机交通类型具体指定信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.FlightSpecifiedOptionType FlightSpecifiedOption = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.FlightSpecifiedOptionTypeOrBuilder getFlightSpecifiedOptionOrBuilder();

  /**
   * <pre>
   * 出发时间。格式: yyyy-MM-dd HH:mm:ss。e.g:2021-08-30 00:00:00
   * </pre>
   *
   * <code>string DepartDate = 6;</code>
   */
  java.lang.String getDepartDate();
  /**
   * <pre>
   * 出发时间。格式: yyyy-MM-dd HH:mm:ss。e.g:2021-08-30 00:00:00
   * </pre>
   *
   * <code>string DepartDate = 6;</code>
   */
  com.google.protobuf.ByteString
      getDepartDateBytes();

  /**
   * <pre>
   * 出发地
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType DepartLocation = 7;</code>
   */
  boolean hasDepartLocation();
  /**
   * <pre>
   * 出发地
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType DepartLocation = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType getDepartLocation();
  /**
   * <pre>
   * 出发地
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType DepartLocation = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder getDepartLocationOrBuilder();

  /**
   * <pre>
   * 到达地
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType ArriveLocation = 8;</code>
   */
  boolean hasArriveLocation();
  /**
   * <pre>
   * 到达地
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType ArriveLocation = 8;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType getArriveLocation();
  /**
   * <pre>
   * 到达地
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType ArriveLocation = 8;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder getArriveLocationOrBuilder();
}
