// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface GiftTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.GiftType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <pre>
   * 礼盒ID，数据库中ID
   * </pre>
   *
   * <code>int64 GiftID = 2;</code>
   */
  long getGiftID();

  /**
   * <pre>
   * 图标名字
   * </pre>
   *
   * <code>string IconName = 3;</code>
   */
  java.lang.String getIconName();
  /**
   * <pre>
   * 图标名字
   * </pre>
   *
   * <code>string IconName = 3;</code>
   */
  com.google.protobuf.ByteString
      getIconNameBytes();

  /**
   * <pre>
   * 礼盒数量
   * </pre>
   *
   * <code>int32 Quantity = 4;</code>
   */
  int getQuantity();

  /**
   * <pre>
   * 展示形式(0 普通礼盒 礼盒展示在价格；1：航班礼盒,2：航线礼盒)
   * </pre>
   *
   * <code>int32 ShowType = 5;</code>
   */
  int getShowType();

  /**
   * <pre>
   * 礼盒类型，0:未指定，此时ServiceList中包含多个服务类型，1：积分，2：保险，3：抵用券，4：其他，5：经深飞，6：休息室，8：优惠券，10：三亚航班，11：酒店住宿，12：行李直挂，13：机场餐食，来自DB
   * </pre>
   *
   * <code>int32 Type = 6;</code>
   */
  int getType();

  /**
   * <pre>
   * 营销Code
   * </pre>
   *
   * <code>string MarketingCode = 7;</code>
   */
  java.lang.String getMarketingCode();
  /**
   * <pre>
   * 营销Code
   * </pre>
   *
   * <code>string MarketingCode = 7;</code>
   */
  com.google.protobuf.ByteString
      getMarketingCodeBytes();

  /**
   * <pre>
   * 中转服务，此时GIftType=0。中转环节会用，用于基础类服务标识——行李直挂、一票到底、航班变无忧、行李代转运，一个礼盒中可以勾选多个类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType GiftService = 8;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType> 
      getGiftServiceList();
  /**
   * <pre>
   * 中转服务，此时GIftType=0。中转环节会用，用于基础类服务标识——行李直挂、一票到底、航班变无忧、行李代转运，一个礼盒中可以勾选多个类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType GiftService = 8;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType getGiftService(int index);
  /**
   * <pre>
   * 中转服务，此时GIftType=0。中转环节会用，用于基础类服务标识——行李直挂、一票到底、航班变无忧、行李代转运，一个礼盒中可以勾选多个类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType GiftService = 8;</code>
   */
  int getGiftServiceCount();
  /**
   * <pre>
   * 中转服务，此时GIftType=0。中转环节会用，用于基础类服务标识——行李直挂、一票到底、航班变无忧、行李代转运，一个礼盒中可以勾选多个类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType GiftService = 8;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceTypeOrBuilder> 
      getGiftServiceOrBuilderList();
  /**
   * <pre>
   * 中转服务，此时GIftType=0。中转环节会用，用于基础类服务标识——行李直挂、一票到底、航班变无忧、行李代转运，一个礼盒中可以勾选多个类型
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceType GiftService = 8;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.GiftServiceTypeOrBuilder getGiftServiceOrBuilder(
      int index);
}
