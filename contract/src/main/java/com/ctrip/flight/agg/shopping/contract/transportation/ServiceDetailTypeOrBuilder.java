// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface ServiceDetailTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.ServiceDetailType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *国内目前支持的取值有：CouponProduct、VIPLounge、Specialty、InsuranceProduct、SecurityChannel、PickUp、PostCard、ServicePackage、MemberInterest、VirtualProduct、DiningCoupon、Metro、Railway
   *国际支持的取值：Pickup,VIPLounge,FlightBoat, FlightCar,GeneralCoupon,ServicePackage,MemberInterest,BaggageAncillary, TransferService, PriceFreeze, DiscountCard, SGR
   * </pre>
   *
   * <code>string ProductType = 1;</code>
   */
  java.lang.String getProductType();
  /**
   * <pre>
   *国内目前支持的取值有：CouponProduct、VIPLounge、Specialty、InsuranceProduct、SecurityChannel、PickUp、PostCard、ServicePackage、MemberInterest、VirtualProduct、DiningCoupon、Metro、Railway
   *国际支持的取值：Pickup,VIPLounge,FlightBoat, FlightCar,GeneralCoupon,ServicePackage,MemberInterest,BaggageAncillary, TransferService, PriceFreeze, DiscountCard, SGR
   * </pre>
   *
   * <code>string ProductType = 1;</code>
   */
  com.google.protobuf.ByteString
      getProductTypeBytes();

  /**
   * <pre>
   *子产品类型
   * </pre>
   *
   * <code>string SubProductType = 2;</code>
   */
  java.lang.String getSubProductType();
  /**
   * <pre>
   *子产品类型
   * </pre>
   *
   * <code>string SubProductType = 2;</code>
   */
  com.google.protobuf.ByteString
      getSubProductTypeBytes();

  /**
   * <pre>
   *产品ID
   * </pre>
   *
   * <code>string ProductID = 3;</code>
   */
  java.lang.String getProductID();
  /**
   * <pre>
   *产品ID
   * </pre>
   *
   * <code>string ProductID = 3;</code>
   */
  com.google.protobuf.ByteString
      getProductIDBytes();

  /**
   * <pre>
   *面价
   * </pre>
   *
   * <code>double PublishPrice = 4;</code>
   */
  double getPublishPrice();

  /**
   * <pre>
   * 售价
   * </pre>
   *
   * <code>double SalePrice = 5;</code>
   */
  double getSalePrice();

  /**
   * <pre>
   * 市场价
   * </pre>
   *
   * <code>double MarketPrice = 6;</code>
   */
  double getMarketPrice();

  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string Name = 7;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string Name = 7;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 短名称
   * </pre>
   *
   * <code>string ShortName = 8;</code>
   */
  java.lang.String getShortName();
  /**
   * <pre>
   * 短名称
   * </pre>
   *
   * <code>string ShortName = 8;</code>
   */
  com.google.protobuf.ByteString
      getShortNameBytes();

  /**
   * <pre>
   * 售卖数量
   * </pre>
   *
   * <code>int32 Count = 9;</code>
   */
  int getCount();

  /**
   * <pre>
   * 是否可取消
   * </pre>
   *
   * <code>bool CancellableInd = 10;</code>
   */
  boolean getCancellableInd();

  /**
   * <pre>
   *产品代码
   * </pre>
   *
   * <code>string ProductCode = 11;</code>
   */
  java.lang.String getProductCode();
  /**
   * <pre>
   *产品代码
   * </pre>
   *
   * <code>string ProductCode = 11;</code>
   */
  com.google.protobuf.ByteString
      getProductCodeBytes();

  /**
   * <pre>
   * 各个产品不通用的附加属性，如
   *  通用券-additionProductInfoID/展示类型
   *  巴士-邻近城市ID
   *  接送机-接送类型/验证码/车的类型
   * 原运价是否还可以销售该X产品  key=SupportSellingPage，value=true 判断取值
   * 打折卡产品版本：key:DiscountCardVersion value:0表示完整（正式）版本，1表示体验版本
   * 打折卡是否自动续费 key: DiscountCardAutoRenewal value: 0表示否;1表示是
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Extension = 12;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getExtensionList();
  /**
   * <pre>
   * 各个产品不通用的附加属性，如
   *  通用券-additionProductInfoID/展示类型
   *  巴士-邻近城市ID
   *  接送机-接送类型/验证码/车的类型
   * 原运价是否还可以销售该X产品  key=SupportSellingPage，value=true 判断取值
   * 打折卡产品版本：key:DiscountCardVersion value:0表示完整（正式）版本，1表示体验版本
   * 打折卡是否自动续费 key: DiscountCardAutoRenewal value: 0表示否;1表示是
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Extension = 12;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getExtension(int index);
  /**
   * <pre>
   * 各个产品不通用的附加属性，如
   *  通用券-additionProductInfoID/展示类型
   *  巴士-邻近城市ID
   *  接送机-接送类型/验证码/车的类型
   * 原运价是否还可以销售该X产品  key=SupportSellingPage，value=true 判断取值
   * 打折卡产品版本：key:DiscountCardVersion value:0表示完整（正式）版本，1表示体验版本
   * 打折卡是否自动续费 key: DiscountCardAutoRenewal value: 0表示否;1表示是
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Extension = 12;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * 各个产品不通用的附加属性，如
   *  通用券-additionProductInfoID/展示类型
   *  巴士-邻近城市ID
   *  接送机-接送类型/验证码/车的类型
   * 原运价是否还可以销售该X产品  key=SupportSellingPage，value=true 判断取值
   * 打折卡产品版本：key:DiscountCardVersion value:0表示完整（正式）版本，1表示体验版本
   * 打折卡是否自动续费 key: DiscountCardAutoRenewal value: 0表示否;1表示是
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Extension = 12;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * 各个产品不通用的附加属性，如
   *  通用券-additionProductInfoID/展示类型
   *  巴士-邻近城市ID
   *  接送机-接送类型/验证码/车的类型
   * 原运价是否还可以销售该X产品  key=SupportSellingPage，value=true 判断取值
   * 打折卡产品版本：key:DiscountCardVersion value:0表示完整（正式）版本，1表示体验版本
   * 打折卡是否自动续费 key: DiscountCardAutoRenewal value: 0表示否;1表示是
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Extension = 12;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getExtensionOrBuilder(
      int index);

  /**
   * <pre>
   * 折扣相关：机票、X 一般不应该两种折扣项一起出现
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountType ServiceDiscount = 13;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountType> 
      getServiceDiscountList();
  /**
   * <pre>
   * 折扣相关：机票、X 一般不应该两种折扣项一起出现
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountType ServiceDiscount = 13;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountType getServiceDiscount(int index);
  /**
   * <pre>
   * 折扣相关：机票、X 一般不应该两种折扣项一起出现
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountType ServiceDiscount = 13;</code>
   */
  int getServiceDiscountCount();
  /**
   * <pre>
   * 折扣相关：机票、X 一般不应该两种折扣项一起出现
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountType ServiceDiscount = 13;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountTypeOrBuilder> 
      getServiceDiscountOrBuilderList();
  /**
   * <pre>
   * 折扣相关：机票、X 一般不应该两种折扣项一起出现
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountType ServiceDiscount = 13;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ServiceDiscountTypeOrBuilder getServiceDiscountOrBuilder(
      int index);

  /**
   * <pre>
   * 强制绑定新字段:需主动勾选 1, 默认勾选且不可取消 2, 默认勾选且可取消 3
   * </pre>
   *
   * <code>int32 ForceType = 14;</code>
   */
  int getForceType();

  /**
   * <pre>
   * 绑定关系，People跟人，Order跟订单
   * </pre>
   *
   * <code>string BindingType = 15;</code>
   */
  java.lang.String getBindingType();
  /**
   * <pre>
   * 绑定关系，People跟人，Order跟订单
   * </pre>
   *
   * <code>string BindingType = 15;</code>
   */
  com.google.protobuf.ByteString
      getBindingTypeBytes();

  /**
   * <pre>
   * 过期时间 0表示不限
   * </pre>
   *
   * <code>int32 ExpiryTime = 16;</code>
   */
  int getExpiryTime();

  /**
   * <pre>
   * 透传x前置过期时间单位 Year, Month, Week, Day, Hour, Minute, Second
   * </pre>
   *
   * <code>string ExpiryTimeUnit = 17;</code>
   */
  java.lang.String getExpiryTimeUnit();
  /**
   * <pre>
   * 透传x前置过期时间单位 Year, Month, Week, Day, Hour, Minute, Second
   * </pre>
   *
   * <code>string ExpiryTimeUnit = 17;</code>
   */
  com.google.protobuf.ByteString
      getExpiryTimeUnitBytes();

  /**
   * <pre>
   * 优先级
   * </pre>
   *
   * <code>int32 Priority = 18;</code>
   */
  int getPriority();

  /**
   * <pre>
   * x产品行李额信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ServiceBaggageType ServiceBaggage = 19;</code>
   */
  boolean hasServiceBaggage();
  /**
   * <pre>
   * x产品行李额信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ServiceBaggageType ServiceBaggage = 19;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ServiceBaggageType getServiceBaggage();
  /**
   * <pre>
   * x产品行李额信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ServiceBaggageType ServiceBaggage = 19;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ServiceBaggageTypeOrBuilder getServiceBaggageOrBuilder();

  /**
   * <pre>
   * 锁价信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ServicePriceFreezeType ServicePriceFreeze = 20;</code>
   */
  boolean hasServicePriceFreeze();
  /**
   * <pre>
   * 锁价信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ServicePriceFreezeType ServicePriceFreeze = 20;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ServicePriceFreezeType getServicePriceFreeze();
  /**
   * <pre>
   * 锁价信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.ServicePriceFreezeType ServicePriceFreeze = 20;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.ServicePriceFreezeTypeOrBuilder getServicePriceFreezeOrBuilder();

  /**
   * <pre>
   * 国内x产品额外输出信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 21;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getTagList();
  /**
   * <pre>
   * 国内x产品额外输出信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 21;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getTag(int index);
  /**
   * <pre>
   * 国内x产品额外输出信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 21;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 国内x产品额外输出信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 21;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 国内x产品额外输出信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 21;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);
}
