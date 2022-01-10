// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface CouponTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.CouponType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <pre>
   * 优惠券类型
   * </pre>
   *
   * <code>string Type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * 优惠券类型
   * </pre>
   *
   * <code>string Type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * 优惠券券码
   * </pre>
   *
   * <code>string CouponCode = 3;</code>
   */
  java.lang.String getCouponCode();
  /**
   * <pre>
   * 优惠券券码
   * </pre>
   *
   * <code>string CouponCode = 3;</code>
   */
  com.google.protobuf.ByteString
      getCouponCodeBytes();

  /**
   * <pre>
   * 折扣金额，指购买此打包产品时总价的优惠，最终的销售价为 (机票价格+Coupon.SalePrice-Coupon.DiscountAmount)
   * </pre>
   *
   * <code>double DiscountAmount = 4;</code>
   */
  double getDiscountAmount();

  /**
   * <pre>
   * 券销售价格
   * </pre>
   *
   * <code>double SalePrice = 5;</code>
   */
  double getSalePrice();
}
