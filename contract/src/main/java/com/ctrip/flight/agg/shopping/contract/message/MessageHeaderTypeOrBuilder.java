// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.message.proto

package com.ctrip.flight.agg.shopping.contract.message;

public interface MessageHeaderTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.message.MessageHeaderType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * SaleChannel
   * </pre>
   *
   * <code>string Channel = 1;</code>
   */
  java.lang.String getChannel();
  /**
   * <pre>
   * SaleChannel
   * </pre>
   *
   * <code>string Channel = 1;</code>
   */
  com.google.protobuf.ByteString
      getChannelBytes();

  /**
   * <pre>
   * 子渠道号
   * </pre>
   *
   * <code>int32 SubChannelID = 2;</code>
   */
  int getSubChannelID();

  /**
   * <pre>
   * 事务号
   * </pre>
   *
   * <code>string TransactionID = 3;</code>
   */
  java.lang.String getTransactionID();
  /**
   * <pre>
   * 事务号
   * </pre>
   *
   * <code>string TransactionID = 3;</code>
   */
  com.google.protobuf.ByteString
      getTransactionIDBytes();

  /**
   * <pre>
   * 请求ID. (对应了国内的VisitorID)
   * </pre>
   *
   * <code>string RequestID = 4;</code>
   */
  java.lang.String getRequestID();
  /**
   * <pre>
   * 请求ID. (对应了国内的VisitorID)
   * </pre>
   *
   * <code>string RequestID = 4;</code>
   */
  com.google.protobuf.ByteString
      getRequestIDBytes();

  /**
   * <pre>
   * 调用方IP
   * </pre>
   *
   * <code>string ClientIP = 5;</code>
   */
  java.lang.String getClientIP();
  /**
   * <pre>
   * 调用方IP
   * </pre>
   *
   * <code>string ClientIP = 5;</code>
   */
  com.google.protobuf.ByteString
      getClientIPBytes();

  /**
   * <pre>
   * mobile的deviceID
   * </pre>
   *
   * <code>string DeviceID = 6;</code>
   */
  java.lang.String getDeviceID();
  /**
   * <pre>
   * mobile的deviceID
   * </pre>
   *
   * <code>string DeviceID = 6;</code>
   */
  com.google.protobuf.ByteString
      getDeviceIDBytes();

  /**
   * <pre>
   * 设备系统(ios/android/其他)
   * </pre>
   *
   * <code>string DevicePlatform = 7;</code>
   */
  java.lang.String getDevicePlatform();
  /**
   * <pre>
   * 设备系统(ios/android/其他)
   * </pre>
   *
   * <code>string DevicePlatform = 7;</code>
   */
  com.google.protobuf.ByteString
      getDevicePlatformBytes();

  /**
   * <pre>
   * 前端会话ID
   * </pre>
   *
   * <code>string SessionID = 8;</code>
   */
  java.lang.String getSessionID();
  /**
   * <pre>
   * 前端会话ID
   * </pre>
   *
   * <code>string SessionID = 8;</code>
   */
  com.google.protobuf.ByteString
      getSessionIDBytes();
}
