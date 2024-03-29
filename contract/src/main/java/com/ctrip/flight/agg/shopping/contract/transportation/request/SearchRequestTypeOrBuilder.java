// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

public interface SearchRequestTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.request.SearchRequestType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 请求头
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.message.RequestHeaderType RequestHeader = 1;</code>
   */
  boolean hasRequestHeader();
  /**
   * <pre>
   * 请求头
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.message.RequestHeaderType RequestHeader = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.message.RequestHeaderType getRequestHeader();
  /**
   * <pre>
   * 请求头
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.message.RequestHeaderType RequestHeader = 1;</code>
   */
  com.ctrip.flight.agg.shopping.contract.message.RequestHeaderTypeOrBuilder getRequestHeaderOrBuilder();

  /**
   * <pre>
   * 请求参数
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.SearchCriteriaType SearchCriteria = 2;</code>
   */
  boolean hasSearchCriteria();
  /**
   * <pre>
   * 请求参数
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.SearchCriteriaType SearchCriteria = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.SearchCriteriaType getSearchCriteria();
  /**
   * <pre>
   * 请求参数
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.SearchCriteriaType SearchCriteria = 2;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.SearchCriteriaTypeOrBuilder getSearchCriteriaOrBuilder();

  /**
   * <pre>
   * 反查参数
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.RouteSearchType RouteSearch = 3;</code>
   */
  boolean hasRouteSearch();
  /**
   * <pre>
   * 反查参数
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.RouteSearchType RouteSearch = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.RouteSearchType getRouteSearch();
  /**
   * <pre>
   * 反查参数
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.request.RouteSearchType RouteSearch = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.RouteSearchTypeOrBuilder getRouteSearchOrBuilder();
}
