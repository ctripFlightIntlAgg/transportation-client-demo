// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType}
 */
public  final class SaleCurrencyPriceDetailType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType)
    SaleCurrencyPriceDetailTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaleCurrencyPriceDetailType.newBuilder() to construct.
  private SaleCurrencyPriceDetailType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaleCurrencyPriceDetailType() {
    discount_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaleCurrencyPriceDetailType(
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
            com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder subBuilder = null;
            if (salePrice_ != null) {
              subBuilder = salePrice_.toBuilder();
            }
            salePrice_ = input.readMessage(com.ctrip.flight.agg.shopping.contract.transportation.AmountType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(salePrice_);
              salePrice_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              discount_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.transportation.DiscountType>();
              mutable_bitField0_ |= 0x00000002;
            }
            discount_.add(
                input.readMessage(com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        discount_ = java.util.Collections.unmodifiableList(discount_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SaleCurrencyPriceDetailType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SaleCurrencyPriceDetailType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType.Builder.class);
  }

  private int bitField0_;
  public static final int SALEPRICE_FIELD_NUMBER = 1;
  private com.ctrip.flight.agg.shopping.contract.transportation.AmountType salePrice_;
  /**
   * <pre>
   * 销售币种的卖价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
   */
  public boolean hasSalePrice() {
    return salePrice_ != null;
  }
  /**
   * <pre>
   * 销售币种的卖价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.AmountType getSalePrice() {
    return salePrice_ == null ? com.ctrip.flight.agg.shopping.contract.transportation.AmountType.getDefaultInstance() : salePrice_;
  }
  /**
   * <pre>
   * 销售币种的卖价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder getSalePriceOrBuilder() {
    return getSalePrice();
  }

  public static final int DISCOUNT_FIELD_NUMBER = 2;
  private java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.DiscountType> discount_;
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
   */
  public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.DiscountType> getDiscountList() {
    return discount_;
  }
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
   */
  public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder> 
      getDiscountOrBuilderList() {
    return discount_;
  }
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
   */
  public int getDiscountCount() {
    return discount_.size();
  }
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType getDiscount(int index) {
    return discount_.get(index);
  }
  /**
   * <pre>
   * 让利信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder getDiscountOrBuilder(
      int index) {
    return discount_.get(index);
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
    if (salePrice_ != null) {
      output.writeMessage(1, getSalePrice());
    }
    for (int i = 0; i < discount_.size(); i++) {
      output.writeMessage(2, discount_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (salePrice_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSalePrice());
    }
    for (int i = 0; i < discount_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, discount_.get(i));
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType other = (com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType) obj;

    boolean result = true;
    result = result && (hasSalePrice() == other.hasSalePrice());
    if (hasSalePrice()) {
      result = result && getSalePrice()
          .equals(other.getSalePrice());
    }
    result = result && getDiscountList()
        .equals(other.getDiscountList());
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
    if (hasSalePrice()) {
      hash = (37 * hash) + SALEPRICE_FIELD_NUMBER;
      hash = (53 * hash) + getSalePrice().hashCode();
    }
    if (getDiscountCount() > 0) {
      hash = (37 * hash) + DISCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDiscountList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType)
      com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SaleCurrencyPriceDetailType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SaleCurrencyPriceDetailType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType.newBuilder()
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
        getDiscountFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (salePriceBuilder_ == null) {
        salePrice_ = null;
      } else {
        salePrice_ = null;
        salePriceBuilder_ = null;
      }
      if (discountBuilder_ == null) {
        discount_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        discountBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SaleCurrencyPriceDetailType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType result = new com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (salePriceBuilder_ == null) {
        result.salePrice_ = salePrice_;
      } else {
        result.salePrice_ = salePriceBuilder_.build();
      }
      if (discountBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          discount_ = java.util.Collections.unmodifiableList(discount_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.discount_ = discount_;
      } else {
        result.discount_ = discountBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType.getDefaultInstance()) return this;
      if (other.hasSalePrice()) {
        mergeSalePrice(other.getSalePrice());
      }
      if (discountBuilder_ == null) {
        if (!other.discount_.isEmpty()) {
          if (discount_.isEmpty()) {
            discount_ = other.discount_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDiscountIsMutable();
            discount_.addAll(other.discount_);
          }
          onChanged();
        }
      } else {
        if (!other.discount_.isEmpty()) {
          if (discountBuilder_.isEmpty()) {
            discountBuilder_.dispose();
            discountBuilder_ = null;
            discount_ = other.discount_;
            bitField0_ = (bitField0_ & ~0x00000002);
            discountBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDiscountFieldBuilder() : null;
          } else {
            discountBuilder_.addAllMessages(other.discount_);
          }
        }
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
      com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.ctrip.flight.agg.shopping.contract.transportation.AmountType salePrice_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.AmountType, com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder> salePriceBuilder_;
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    public boolean hasSalePrice() {
      return salePriceBuilder_ != null || salePrice_ != null;
    }
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.AmountType getSalePrice() {
      if (salePriceBuilder_ == null) {
        return salePrice_ == null ? com.ctrip.flight.agg.shopping.contract.transportation.AmountType.getDefaultInstance() : salePrice_;
      } else {
        return salePriceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    public Builder setSalePrice(com.ctrip.flight.agg.shopping.contract.transportation.AmountType value) {
      if (salePriceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        salePrice_ = value;
        onChanged();
      } else {
        salePriceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    public Builder setSalePrice(
        com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder builderForValue) {
      if (salePriceBuilder_ == null) {
        salePrice_ = builderForValue.build();
        onChanged();
      } else {
        salePriceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    public Builder mergeSalePrice(com.ctrip.flight.agg.shopping.contract.transportation.AmountType value) {
      if (salePriceBuilder_ == null) {
        if (salePrice_ != null) {
          salePrice_ =
            com.ctrip.flight.agg.shopping.contract.transportation.AmountType.newBuilder(salePrice_).mergeFrom(value).buildPartial();
        } else {
          salePrice_ = value;
        }
        onChanged();
      } else {
        salePriceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    public Builder clearSalePrice() {
      if (salePriceBuilder_ == null) {
        salePrice_ = null;
        onChanged();
      } else {
        salePrice_ = null;
        salePriceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder getSalePriceBuilder() {
      
      onChanged();
      return getSalePriceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder getSalePriceOrBuilder() {
      if (salePriceBuilder_ != null) {
        return salePriceBuilder_.getMessageOrBuilder();
      } else {
        return salePrice_ == null ?
            com.ctrip.flight.agg.shopping.contract.transportation.AmountType.getDefaultInstance() : salePrice_;
      }
    }
    /**
     * <pre>
     * 销售币种的卖价
     * </pre>
     *
     * <code>.com.ctrip.flight.agg.shopping.contract.transportation.AmountType SalePrice = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.AmountType, com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder> 
        getSalePriceFieldBuilder() {
      if (salePriceBuilder_ == null) {
        salePriceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.transportation.AmountType, com.ctrip.flight.agg.shopping.contract.transportation.AmountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.AmountTypeOrBuilder>(
                getSalePrice(),
                getParentForChildren(),
                isClean());
        salePrice_ = null;
      }
      return salePriceBuilder_;
    }

    private java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.DiscountType> discount_ =
      java.util.Collections.emptyList();
    private void ensureDiscountIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        discount_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.transportation.DiscountType>(discount_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.DiscountType, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder> discountBuilder_;

    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.DiscountType> getDiscountList() {
      if (discountBuilder_ == null) {
        return java.util.Collections.unmodifiableList(discount_);
      } else {
        return discountBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public int getDiscountCount() {
      if (discountBuilder_ == null) {
        return discount_.size();
      } else {
        return discountBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType getDiscount(int index) {
      if (discountBuilder_ == null) {
        return discount_.get(index);
      } else {
        return discountBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder setDiscount(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType value) {
      if (discountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscountIsMutable();
        discount_.set(index, value);
        onChanged();
      } else {
        discountBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder setDiscount(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder builderForValue) {
      if (discountBuilder_ == null) {
        ensureDiscountIsMutable();
        discount_.set(index, builderForValue.build());
        onChanged();
      } else {
        discountBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder addDiscount(com.ctrip.flight.agg.shopping.contract.transportation.DiscountType value) {
      if (discountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscountIsMutable();
        discount_.add(value);
        onChanged();
      } else {
        discountBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder addDiscount(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType value) {
      if (discountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscountIsMutable();
        discount_.add(index, value);
        onChanged();
      } else {
        discountBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder addDiscount(
        com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder builderForValue) {
      if (discountBuilder_ == null) {
        ensureDiscountIsMutable();
        discount_.add(builderForValue.build());
        onChanged();
      } else {
        discountBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder addDiscount(
        int index, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder builderForValue) {
      if (discountBuilder_ == null) {
        ensureDiscountIsMutable();
        discount_.add(index, builderForValue.build());
        onChanged();
      } else {
        discountBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder addAllDiscount(
        java.lang.Iterable<? extends com.ctrip.flight.agg.shopping.contract.transportation.DiscountType> values) {
      if (discountBuilder_ == null) {
        ensureDiscountIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, discount_);
        onChanged();
      } else {
        discountBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder clearDiscount() {
      if (discountBuilder_ == null) {
        discount_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        discountBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public Builder removeDiscount(int index) {
      if (discountBuilder_ == null) {
        ensureDiscountIsMutable();
        discount_.remove(index);
        onChanged();
      } else {
        discountBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder getDiscountBuilder(
        int index) {
      return getDiscountFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder getDiscountOrBuilder(
        int index) {
      if (discountBuilder_ == null) {
        return discount_.get(index);  } else {
        return discountBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder> 
         getDiscountOrBuilderList() {
      if (discountBuilder_ != null) {
        return discountBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(discount_);
      }
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder addDiscountBuilder() {
      return getDiscountFieldBuilder().addBuilder(
          com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.getDefaultInstance());
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder addDiscountBuilder(
        int index) {
      return getDiscountFieldBuilder().addBuilder(
          index, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.getDefaultInstance());
    }
    /**
     * <pre>
     * 让利信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.DiscountType Discount = 2;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder> 
         getDiscountBuilderList() {
      return getDiscountFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.transportation.DiscountType, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder> 
        getDiscountFieldBuilder() {
      if (discountBuilder_ == null) {
        discountBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.transportation.DiscountType, com.ctrip.flight.agg.shopping.contract.transportation.DiscountType.Builder, com.ctrip.flight.agg.shopping.contract.transportation.DiscountTypeOrBuilder>(
                discount_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        discount_ = null;
      }
      return discountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaleCurrencyPriceDetailType>
      PARSER = new com.google.protobuf.AbstractParser<SaleCurrencyPriceDetailType>() {
    @java.lang.Override
    public SaleCurrencyPriceDetailType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaleCurrencyPriceDetailType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaleCurrencyPriceDetailType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaleCurrencyPriceDetailType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.SaleCurrencyPriceDetailType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

