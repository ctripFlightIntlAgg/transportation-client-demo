// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface ProductItemReferenceTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.ProductItemReferenceType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Ref列表
   * </pre>
   *
   * <code>repeated string ProductRef = 1;</code>
   */
  java.util.List<java.lang.String>
      getProductRefList();
  /**
   * <pre>
   * Ref列表
   * </pre>
   *
   * <code>repeated string ProductRef = 1;</code>
   */
  int getProductRefCount();
  /**
   * <pre>
   * Ref列表
   * </pre>
   *
   * <code>repeated string ProductRef = 1;</code>
   */
  java.lang.String getProductRef(int index);
  /**
   * <pre>
   * Ref列表
   * </pre>
   *
   * <code>repeated string ProductRef = 1;</code>
   */
  com.google.protobuf.ByteString
      getProductRefBytes(int index);

  /**
   * <pre>
   * 类型
   * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
   * </pre>
   *
   * <code>string Type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * 类型
   * 取值：RefundServicePackage：退票服务包，PackedBaggage：打包行李
   * </pre>
   *
   * <code>string Type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
