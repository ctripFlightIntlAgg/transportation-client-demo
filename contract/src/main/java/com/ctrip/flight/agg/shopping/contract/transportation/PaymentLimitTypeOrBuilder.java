// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface PaymentLimitTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.PaymentLimitType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 支付类型， “拿去花”等
   * </pre>
   *
   * <code>repeated string PrepayType = 1;</code>
   */
  java.util.List<java.lang.String>
      getPrepayTypeList();
  /**
   * <pre>
   * 支付类型， “拿去花”等
   * </pre>
   *
   * <code>repeated string PrepayType = 1;</code>
   */
  int getPrepayTypeCount();
  /**
   * <pre>
   * 支付类型， “拿去花”等
   * </pre>
   *
   * <code>repeated string PrepayType = 1;</code>
   */
  java.lang.String getPrepayType(int index);
  /**
   * <pre>
   * 支付类型， “拿去花”等
   * </pre>
   *
   * <code>repeated string PrepayType = 1;</code>
   */
  com.google.protobuf.ByteString
      getPrepayTypeBytes(int index);

  /**
   * <pre>
   * 信用卡支付限制的信息索引
   * </pre>
   *
   * <code>repeated int32 CreditCardPaymentLimitRef = 2;</code>
   */
  java.util.List<java.lang.Integer> getCreditCardPaymentLimitRefList();
  /**
   * <pre>
   * 信用卡支付限制的信息索引
   * </pre>
   *
   * <code>repeated int32 CreditCardPaymentLimitRef = 2;</code>
   */
  int getCreditCardPaymentLimitRefCount();
  /**
   * <pre>
   * 信用卡支付限制的信息索引
   * </pre>
   *
   * <code>repeated int32 CreditCardPaymentLimitRef = 2;</code>
   */
  int getCreditCardPaymentLimitRef(int index);

  /**
   * <pre>
   * 支付卡让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefType PaymentDiscountRefType = 3;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefType> 
      getPaymentDiscountRefTypeList();
  /**
   * <pre>
   * 支付卡让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefType PaymentDiscountRefType = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefType getPaymentDiscountRefType(int index);
  /**
   * <pre>
   * 支付卡让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefType PaymentDiscountRefType = 3;</code>
   */
  int getPaymentDiscountRefTypeCount();
  /**
   * <pre>
   * 支付卡让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefType PaymentDiscountRefType = 3;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefTypeOrBuilder> 
      getPaymentDiscountRefTypeOrBuilderList();
  /**
   * <pre>
   * 支付卡让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefType PaymentDiscountRefType = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.PaymentDiscountRefTypeOrBuilder getPaymentDiscountRefTypeOrBuilder(
      int index);
}
