// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface TransportTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.TransportType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 索引号
   * </pre>
   *
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <pre>
   * 交通工具类型，1-flight; 2-train; 4-bus
   * </pre>
   *
   * <code>int32 Type = 2;</code>
   */
  int getType();

  /**
   * <pre>
   * 航班号、火车车次号等
   * </pre>
   *
   * <code>string TransportNo = 3;</code>
   */
  java.lang.String getTransportNo();
  /**
   * <pre>
   * 航班号、火车车次号等
   * </pre>
   *
   * <code>string TransportNo = 3;</code>
   */
  com.google.protobuf.ByteString
      getTransportNoBytes();

  /**
   * <pre>
   * 出发时间，format: yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string DepartDateTime = 4;</code>
   */
  java.lang.String getDepartDateTime();
  /**
   * <pre>
   * 出发时间，format: yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string DepartDateTime = 4;</code>
   */
  com.google.protobuf.ByteString
      getDepartDateTimeBytes();

  /**
   * <pre>
   * 出发点信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PointType DepartPoint = 5;</code>
   */
  boolean hasDepartPoint();
  /**
   * <pre>
   * 出发点信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PointType DepartPoint = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PointType getDepartPoint();
  /**
   * <pre>
   * 出发点信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PointType DepartPoint = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PointTypeOrBuilder getDepartPointOrBuilder();

  /**
   * <pre>
   * 到达时间，format: yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string ArriveDateTime = 6;</code>
   */
  java.lang.String getArriveDateTime();
  /**
   * <pre>
   * 到达时间，format: yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string ArriveDateTime = 6;</code>
   */
  com.google.protobuf.ByteString
      getArriveDateTimeBytes();

  /**
   * <pre>
   * 到达点信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PointType ArrivePoint = 7;</code>
   */
  boolean hasArrivePoint();
  /**
   * <pre>
   * 到达点信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PointType ArrivePoint = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PointType getArrivePoint();
  /**
   * <pre>
   * 到达点信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.PointType ArrivePoint = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PointTypeOrBuilder getArrivePointOrBuilder();

  /**
   * <pre>
   * 耗时间隔，单位分钟
   * </pre>
   *
   * <code>int32 DurationMinutes = 8;</code>
   */
  int getDurationMinutes();

  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getTagList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getTag(int index);
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 9;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);

  /**
   * <pre>
   * flight类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightType Flight = 10;</code>
   */
  boolean hasFlight();
  /**
   * <pre>
   * flight类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightType Flight = 10;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FlightType getFlight();
  /**
   * <pre>
   * flight类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.FlightType Flight = 10;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FlightTypeOrBuilder getFlightOrBuilder();

  /**
   * <pre>
   * train类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.TrainType Train = 11;</code>
   */
  boolean hasTrain();
  /**
   * <pre>
   * train类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.TrainType Train = 11;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.TrainType getTrain();
  /**
   * <pre>
   * train类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.TrainType Train = 11;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.TrainTypeOrBuilder getTrainOrBuilder();

  /**
   * <pre>
   * Bus类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.BusType Bus = 12;</code>
   */
  boolean hasBus();
  /**
   * <pre>
   * Bus类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.BusType Bus = 12;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.BusType getBus();
  /**
   * <pre>
   * Bus类型扩展信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.BusType Bus = 12;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.BusTypeOrBuilder getBusOrBuilder();
}
