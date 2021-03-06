// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface AmountTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.AmountType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 金额
   * </pre>
   *
   * <code>double Value = 1;</code>
   */
  double getValue();

  /**
   * <pre>
   * 收款方, 0:表示携程代收代付，1:表示航司收款
   * </pre>
   *
   * <code>int32 Payee = 2;</code>
   */
  int getPayee();
}
