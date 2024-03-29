// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

public interface RouteSearchTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.request.RouteSearchType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * 查询模式，默认0或者RouteSearchType为空表示列表查询。
   * 1: 普通反查 (匹配前MaxJourneyNo程的航班);
   * 2: 严格反查 (严格匹配所有行程的价格);
   * 3: 严格反查前N程 (严格匹配前MaxJourneyNo程的价格)
   * </pre>
   *
   * <code>int32 SearchMode = 1;</code>
   */
  int getSearchMode();

  /**
   * <pre>
   * 反查时待匹配的最大行程号(SearchMode = 2时忽略该字段)
   * </pre>
   *
   * <code>int32 MaxJourneyNo = 2;</code>
   */
  int getMaxJourneyNo();

  /**
   * <pre>
   * 该接口返回的OfferToken，反查时用
   * </pre>
   *
   * <code>string OfferToken = 3;</code>
   */
  java.lang.String getOfferToken();
  /**
   * <pre>
   * 该接口返回的OfferToken，反查时用
   * </pre>
   *
   * <code>string OfferToken = 3;</code>
   */
  com.google.protobuf.ByteString
      getOfferTokenBytes();

  /**
   * <pre>
   * 国际agg查询接口返回的价格token，为了兼容
   * </pre>
   *
   * <code>string IntlAggRouteSearchToken = 4;</code>
   */
  java.lang.String getIntlAggRouteSearchToken();
  /**
   * <pre>
   * 国际agg查询接口返回的价格token，为了兼容
   * </pre>
   *
   * <code>string IntlAggRouteSearchToken = 4;</code>
   */
  com.google.protobuf.ByteString
      getIntlAggRouteSearchTokenBytes();

  /**
   * <pre>
   * 分程查询时指定每一程的offertoken进行严格反查 仅严格反查生效
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenType SeparateJourneyOfferToken = 5;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenType> 
      getSeparateJourneyOfferTokenList();
  /**
   * <pre>
   * 分程查询时指定每一程的offertoken进行严格反查 仅严格反查生效
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenType SeparateJourneyOfferToken = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenType getSeparateJourneyOfferToken(int index);
  /**
   * <pre>
   * 分程查询时指定每一程的offertoken进行严格反查 仅严格反查生效
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenType SeparateJourneyOfferToken = 5;</code>
   */
  int getSeparateJourneyOfferTokenCount();
  /**
   * <pre>
   * 分程查询时指定每一程的offertoken进行严格反查 仅严格反查生效
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenType SeparateJourneyOfferToken = 5;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenTypeOrBuilder> 
      getSeparateJourneyOfferTokenOrBuilderList();
  /**
   * <pre>
   * 分程查询时指定每一程的offertoken进行严格反查 仅严格反查生效
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenType SeparateJourneyOfferToken = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.SeparateJourneyOfferTokenTypeOrBuilder getSeparateJourneyOfferTokenOrBuilder(
      int index);
}
