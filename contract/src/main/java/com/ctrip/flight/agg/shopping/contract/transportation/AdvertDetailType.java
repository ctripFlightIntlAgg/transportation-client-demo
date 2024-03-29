// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * <pre>
 * 广告x产品详情
 * </pre>
 *
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType}
 */
public  final class AdvertDetailType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType)
    AdvertDetailTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvertDetailType.newBuilder() to construct.
  private AdvertDetailType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvertDetailType() {
    productType_ = "";
    subProductType_ = "";
    productID_ = "";
    salePrice_ = 0D;
    publishPrice_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdvertDetailType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            productType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            subProductType_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            productID_ = s;
            break;
          }
          case 33: {

            salePrice_ = input.readDouble();
            break;
          }
          case 41: {

            publishPrice_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_AdvertDetailType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_AdvertDetailType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType.Builder.class);
  }

  public static final int PRODUCTTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object productType_;
  /**
   * <pre>
   * 产品类型，GiftProduct：礼盒，CouponProduct：优惠券，InsuranceProduct：保险，FlightXComposition：三选X、赠定减、X打包，VIPLounge：休息室，SecurityChannel：安检通道，Parking：停车场，ComboXRule：买X赠X，AdvertXPackage：广告营销N选X，MemberInterest：会员权益（旅行家），Specialty：实物，PickUp：接送机。WIFI：WIFI，FlightCoupon：机票券，PickUpCoupon：接送机券
   * </pre>
   *
   * <code>string ProductType = 1;</code>
   */
  public java.lang.String getProductType() {
    java.lang.Object ref = productType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 产品类型，GiftProduct：礼盒，CouponProduct：优惠券，InsuranceProduct：保险，FlightXComposition：三选X、赠定减、X打包，VIPLounge：休息室，SecurityChannel：安检通道，Parking：停车场，ComboXRule：买X赠X，AdvertXPackage：广告营销N选X，MemberInterest：会员权益（旅行家），Specialty：实物，PickUp：接送机。WIFI：WIFI，FlightCoupon：机票券，PickUpCoupon：接送机券
   * </pre>
   *
   * <code>string ProductType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProductTypeBytes() {
    java.lang.Object ref = productType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBPRODUCTTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object subProductType_;
  /**
   * <pre>
   * 子产品类型
   * </pre>
   *
   * <code>string SubProductType = 2;</code>
   */
  public java.lang.String getSubProductType() {
    java.lang.Object ref = subProductType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subProductType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 子产品类型
   * </pre>
   *
   * <code>string SubProductType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSubProductTypeBytes() {
    java.lang.Object ref = subProductType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subProductType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCTID_FIELD_NUMBER = 3;
  private volatile java.lang.Object productID_;
  /**
   * <pre>
   * 产品ID
   * </pre>
   *
   * <code>string ProductID = 3;</code>
   */
  public java.lang.String getProductID() {
    java.lang.Object ref = productID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productID_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 产品ID
   * </pre>
   *
   * <code>string ProductID = 3;</code>
   */
  public com.google.protobuf.ByteString
      getProductIDBytes() {
    java.lang.Object ref = productID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SALEPRICE_FIELD_NUMBER = 4;
  private double salePrice_;
  /**
   * <pre>
   * 售价
   * </pre>
   *
   * <code>double SalePrice = 4;</code>
   */
  public double getSalePrice() {
    return salePrice_;
  }

  public static final int PUBLISHPRICE_FIELD_NUMBER = 5;
  private double publishPrice_;
  /**
   * <pre>
   * 面价
   * </pre>
   *
   * <code>double PublishPrice = 5;</code>
   */
  public double getPublishPrice() {
    return publishPrice_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProductTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productType_);
    }
    if (!getSubProductTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subProductType_);
    }
    if (!getProductIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, productID_);
    }
    if (salePrice_ != 0D) {
      output.writeDouble(4, salePrice_);
    }
    if (publishPrice_ != 0D) {
      output.writeDouble(5, publishPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productType_);
    }
    if (!getSubProductTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subProductType_);
    }
    if (!getProductIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, productID_);
    }
    if (salePrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, salePrice_);
    }
    if (publishPrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, publishPrice_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType other = (com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType) obj;

    boolean result = true;
    result = result && getProductType()
        .equals(other.getProductType());
    result = result && getSubProductType()
        .equals(other.getSubProductType());
    result = result && getProductID()
        .equals(other.getProductID());
    result = result && (
        java.lang.Double.doubleToLongBits(getSalePrice())
        == java.lang.Double.doubleToLongBits(
            other.getSalePrice()));
    result = result && (
        java.lang.Double.doubleToLongBits(getPublishPrice())
        == java.lang.Double.doubleToLongBits(
            other.getPublishPrice()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRODUCTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getProductType().hashCode();
    hash = (37 * hash) + SUBPRODUCTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSubProductType().hashCode();
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + getProductID().hashCode();
    hash = (37 * hash) + SALEPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSalePrice()));
    hash = (37 * hash) + PUBLISHPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPublishPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 广告x产品详情
   * </pre>
   *
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType)
      com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_AdvertDetailType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_AdvertDetailType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      productType_ = "";

      subProductType_ = "";

      productID_ = "";

      salePrice_ = 0D;

      publishPrice_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_AdvertDetailType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType result = new com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType(this);
      result.productType_ = productType_;
      result.subProductType_ = subProductType_;
      result.productID_ = productID_;
      result.salePrice_ = salePrice_;
      result.publishPrice_ = publishPrice_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType.getDefaultInstance()) return this;
      if (!other.getProductType().isEmpty()) {
        productType_ = other.productType_;
        onChanged();
      }
      if (!other.getSubProductType().isEmpty()) {
        subProductType_ = other.subProductType_;
        onChanged();
      }
      if (!other.getProductID().isEmpty()) {
        productID_ = other.productID_;
        onChanged();
      }
      if (other.getSalePrice() != 0D) {
        setSalePrice(other.getSalePrice());
      }
      if (other.getPublishPrice() != 0D) {
        setPublishPrice(other.getPublishPrice());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object productType_ = "";
    /**
     * <pre>
     * 产品类型，GiftProduct：礼盒，CouponProduct：优惠券，InsuranceProduct：保险，FlightXComposition：三选X、赠定减、X打包，VIPLounge：休息室，SecurityChannel：安检通道，Parking：停车场，ComboXRule：买X赠X，AdvertXPackage：广告营销N选X，MemberInterest：会员权益（旅行家），Specialty：实物，PickUp：接送机。WIFI：WIFI，FlightCoupon：机票券，PickUpCoupon：接送机券
     * </pre>
     *
     * <code>string ProductType = 1;</code>
     */
    public java.lang.String getProductType() {
      java.lang.Object ref = productType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 产品类型，GiftProduct：礼盒，CouponProduct：优惠券，InsuranceProduct：保险，FlightXComposition：三选X、赠定减、X打包，VIPLounge：休息室，SecurityChannel：安检通道，Parking：停车场，ComboXRule：买X赠X，AdvertXPackage：广告营销N选X，MemberInterest：会员权益（旅行家），Specialty：实物，PickUp：接送机。WIFI：WIFI，FlightCoupon：机票券，PickUpCoupon：接送机券
     * </pre>
     *
     * <code>string ProductType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProductTypeBytes() {
      java.lang.Object ref = productType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 产品类型，GiftProduct：礼盒，CouponProduct：优惠券，InsuranceProduct：保险，FlightXComposition：三选X、赠定减、X打包，VIPLounge：休息室，SecurityChannel：安检通道，Parking：停车场，ComboXRule：买X赠X，AdvertXPackage：广告营销N选X，MemberInterest：会员权益（旅行家），Specialty：实物，PickUp：接送机。WIFI：WIFI，FlightCoupon：机票券，PickUpCoupon：接送机券
     * </pre>
     *
     * <code>string ProductType = 1;</code>
     */
    public Builder setProductType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 产品类型，GiftProduct：礼盒，CouponProduct：优惠券，InsuranceProduct：保险，FlightXComposition：三选X、赠定减、X打包，VIPLounge：休息室，SecurityChannel：安检通道，Parking：停车场，ComboXRule：买X赠X，AdvertXPackage：广告营销N选X，MemberInterest：会员权益（旅行家），Specialty：实物，PickUp：接送机。WIFI：WIFI，FlightCoupon：机票券，PickUpCoupon：接送机券
     * </pre>
     *
     * <code>string ProductType = 1;</code>
     */
    public Builder clearProductType() {
      
      productType_ = getDefaultInstance().getProductType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 产品类型，GiftProduct：礼盒，CouponProduct：优惠券，InsuranceProduct：保险，FlightXComposition：三选X、赠定减、X打包，VIPLounge：休息室，SecurityChannel：安检通道，Parking：停车场，ComboXRule：买X赠X，AdvertXPackage：广告营销N选X，MemberInterest：会员权益（旅行家），Specialty：实物，PickUp：接送机。WIFI：WIFI，FlightCoupon：机票券，PickUpCoupon：接送机券
     * </pre>
     *
     * <code>string ProductType = 1;</code>
     */
    public Builder setProductTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subProductType_ = "";
    /**
     * <pre>
     * 子产品类型
     * </pre>
     *
     * <code>string SubProductType = 2;</code>
     */
    public java.lang.String getSubProductType() {
      java.lang.Object ref = subProductType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subProductType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 子产品类型
     * </pre>
     *
     * <code>string SubProductType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSubProductTypeBytes() {
      java.lang.Object ref = subProductType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subProductType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 子产品类型
     * </pre>
     *
     * <code>string SubProductType = 2;</code>
     */
    public Builder setSubProductType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subProductType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 子产品类型
     * </pre>
     *
     * <code>string SubProductType = 2;</code>
     */
    public Builder clearSubProductType() {
      
      subProductType_ = getDefaultInstance().getSubProductType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 子产品类型
     * </pre>
     *
     * <code>string SubProductType = 2;</code>
     */
    public Builder setSubProductTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subProductType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object productID_ = "";
    /**
     * <pre>
     * 产品ID
     * </pre>
     *
     * <code>string ProductID = 3;</code>
     */
    public java.lang.String getProductID() {
      java.lang.Object ref = productID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 产品ID
     * </pre>
     *
     * <code>string ProductID = 3;</code>
     */
    public com.google.protobuf.ByteString
        getProductIDBytes() {
      java.lang.Object ref = productID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 产品ID
     * </pre>
     *
     * <code>string ProductID = 3;</code>
     */
    public Builder setProductID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productID_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 产品ID
     * </pre>
     *
     * <code>string ProductID = 3;</code>
     */
    public Builder clearProductID() {
      
      productID_ = getDefaultInstance().getProductID();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 产品ID
     * </pre>
     *
     * <code>string ProductID = 3;</code>
     */
    public Builder setProductIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productID_ = value;
      onChanged();
      return this;
    }

    private double salePrice_ ;
    /**
     * <pre>
     * 售价
     * </pre>
     *
     * <code>double SalePrice = 4;</code>
     */
    public double getSalePrice() {
      return salePrice_;
    }
    /**
     * <pre>
     * 售价
     * </pre>
     *
     * <code>double SalePrice = 4;</code>
     */
    public Builder setSalePrice(double value) {
      
      salePrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 售价
     * </pre>
     *
     * <code>double SalePrice = 4;</code>
     */
    public Builder clearSalePrice() {
      
      salePrice_ = 0D;
      onChanged();
      return this;
    }

    private double publishPrice_ ;
    /**
     * <pre>
     * 面价
     * </pre>
     *
     * <code>double PublishPrice = 5;</code>
     */
    public double getPublishPrice() {
      return publishPrice_;
    }
    /**
     * <pre>
     * 面价
     * </pre>
     *
     * <code>double PublishPrice = 5;</code>
     */
    public Builder setPublishPrice(double value) {
      
      publishPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 面价
     * </pre>
     *
     * <code>double PublishPrice = 5;</code>
     */
    public Builder clearPublishPrice() {
      
      publishPrice_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvertDetailType>
      PARSER = new com.google.protobuf.AbstractParser<AdvertDetailType>() {
    @java.lang.Override
    public AdvertDetailType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdvertDetailType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdvertDetailType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvertDetailType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.AdvertDetailType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

