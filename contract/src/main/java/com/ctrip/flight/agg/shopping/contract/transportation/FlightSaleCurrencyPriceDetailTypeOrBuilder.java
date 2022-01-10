// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface FlightSaleCurrencyPriceDetailTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.FlightSaleCurrencyPriceDetailType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 卖价，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
   */
  boolean hasSalePrice();
  /**
   * <pre>
   * 卖价，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.AmountType getSalePrice();
  /**
   * <pre>
   * 卖价，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder getSalePriceOrBuilder();

  /**
   * <pre>
   * 税费，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Tax = 2;</code>
   */
  boolean hasTax();
  /**
   * <pre>
   * 税费，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Tax = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.AmountType getTax();
  /**
   * <pre>
   * 税费，销售币种
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType Tax = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder getTaxOrBuilder();

  /**
   * <pre>
   * 票面价(公布价)， 等于国内的PrintPrice
   * </pre>
   *
   * <code>double PublishPrice = 3;</code>
   */
  double getPublishPrice();

  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 4;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.DiscountType> 
      getDiscountList();
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.DiscountType getDiscount(int index);
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 4;</code>
   */
  int getDiscountCount();
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 4;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder> 
      getDiscountOrBuilderList();
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder getDiscountOrBuilder(
      int index);

  /**
   * <pre>
   * 折扣(销售价/舱等全价)
   * </pre>
   *
   * <code>double Rate = 5;</code>
   */
  double getRate();

  /**
   * <pre>
   * 国内航司优惠前价格，前端结合Discount和PcCode做展示用
   * </pre>
   *
   * <code>double PrePcCodePrice = 6;</code>
   */
  double getPrePcCodePrice();

  /**
   * <pre>
   * 服务费明细列表, 销售币种
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeType ServiceFee = 7;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeType> 
      getServiceFeeList();
  /**
   * <pre>
   * 服务费明细列表, 销售币种
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeType ServiceFee = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeType getServiceFee(int index);
  /**
   * <pre>
   * 服务费明细列表, 销售币种
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeType ServiceFee = 7;</code>
   */
  int getServiceFeeCount();
  /**
   * <pre>
   * 服务费明细列表, 销售币种
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeType ServiceFee = 7;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeTypeOrBuilder> 
      getServiceFeeOrBuilderList();
  /**
   * <pre>
   * 服务费明细列表, 销售币种
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeType ServiceFee = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ServiceFeeTypeOrBuilder getServiceFeeOrBuilder(
      int index);

  /**
   * <pre>
   * 机酒专享政策优惠金额（与外放最低价价差）
   * </pre>
   *
   * <code>double FlightHotelDiscountAmount = 8;</code>
   */
  double getFlightHotelDiscountAmount();
}
