// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface AncillariesTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.AncillariesType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <pre>
   * 值机服务属性(0:不支持在线购买,1:支持在线购买,2：必须在线购买)
   * </pre>
   *
   * <code>int32 CheckInServiceStatus = 4;</code>
   */
  int getCheckInServiceStatus();
}
