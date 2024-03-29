// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType}
 */
public  final class SettlementCurrencyPriceDetailType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType)
    SettlementCurrencyPriceDetailTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SettlementCurrencyPriceDetailType.newBuilder() to construct.
  private SettlementCurrencyPriceDetailType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SettlementCurrencyPriceDetailType() {
    currency_ = "";
    publishPrice_ = 0D;
    exchangeRate_ = 0D;
    seatPrice_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SettlementCurrencyPriceDetailType(
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

            currency_ = s;
            break;
          }
          case 17: {

            publishPrice_ = input.readDouble();
            break;
          }
          case 25: {

            exchangeRate_ = input.readDouble();
            break;
          }
          case 33: {

            seatPrice_ = input.readDouble();
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SettlementCurrencyPriceDetailType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SettlementCurrencyPriceDetailType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType.Builder.class);
  }

  public static final int CURRENCY_FIELD_NUMBER = 1;
  private volatile java.lang.Object currency_;
  /**
   * <pre>
   * 结算币种
   * </pre>
   *
   * <code>string Currency = 1;</code>
   */
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 结算币种
   * </pre>
   *
   * <code>string Currency = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLISHPRICE_FIELD_NUMBER = 2;
  private double publishPrice_;
  /**
   * <pre>
   * 票面价
   * </pre>
   *
   * <code>double PublishPrice = 2;</code>
   */
  public double getPublishPrice() {
    return publishPrice_;
  }

  public static final int EXCHANGERATE_FIELD_NUMBER = 3;
  private double exchangeRate_;
  /**
   * <pre>
   * 结算币种到销售币种间的汇率
   * </pre>
   *
   * <code>double ExchangeRate = 3;</code>
   */
  public double getExchangeRate() {
    return exchangeRate_;
  }

  public static final int SEATPRICE_FIELD_NUMBER = 4;
  private double seatPrice_;
  /**
   * <pre>
   * 坐席价
   * </pre>
   *
   * <code>double SeatPrice = 4;</code>
   */
  public double getSeatPrice() {
    return seatPrice_;
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
    if (!getCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currency_);
    }
    if (publishPrice_ != 0D) {
      output.writeDouble(2, publishPrice_);
    }
    if (exchangeRate_ != 0D) {
      output.writeDouble(3, exchangeRate_);
    }
    if (seatPrice_ != 0D) {
      output.writeDouble(4, seatPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, currency_);
    }
    if (publishPrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, publishPrice_);
    }
    if (exchangeRate_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, exchangeRate_);
    }
    if (seatPrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, seatPrice_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType other = (com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType) obj;

    boolean result = true;
    result = result && getCurrency()
        .equals(other.getCurrency());
    result = result && (
        java.lang.Double.doubleToLongBits(getPublishPrice())
        == java.lang.Double.doubleToLongBits(
            other.getPublishPrice()));
    result = result && (
        java.lang.Double.doubleToLongBits(getExchangeRate())
        == java.lang.Double.doubleToLongBits(
            other.getExchangeRate()));
    result = result && (
        java.lang.Double.doubleToLongBits(getSeatPrice())
        == java.lang.Double.doubleToLongBits(
            other.getSeatPrice()));
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
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    hash = (37 * hash) + PUBLISHPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPublishPrice()));
    hash = (37 * hash) + EXCHANGERATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getExchangeRate()));
    hash = (37 * hash) + SEATPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSeatPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType)
      com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SettlementCurrencyPriceDetailType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SettlementCurrencyPriceDetailType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType.newBuilder()
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
      currency_ = "";

      publishPrice_ = 0D;

      exchangeRate_ = 0D;

      seatPrice_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_SettlementCurrencyPriceDetailType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType result = new com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType(this);
      result.currency_ = currency_;
      result.publishPrice_ = publishPrice_;
      result.exchangeRate_ = exchangeRate_;
      result.seatPrice_ = seatPrice_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType.getDefaultInstance()) return this;
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        onChanged();
      }
      if (other.getPublishPrice() != 0D) {
        setPublishPrice(other.getPublishPrice());
      }
      if (other.getExchangeRate() != 0D) {
        setExchangeRate(other.getExchangeRate());
      }
      if (other.getSeatPrice() != 0D) {
        setSeatPrice(other.getSeatPrice());
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
      com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object currency_ = "";
    /**
     * <pre>
     * 结算币种
     * </pre>
     *
     * <code>string Currency = 1;</code>
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 结算币种
     * </pre>
     *
     * <code>string Currency = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 结算币种
     * </pre>
     *
     * <code>string Currency = 1;</code>
     */
    public Builder setCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currency_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 结算币种
     * </pre>
     *
     * <code>string Currency = 1;</code>
     */
    public Builder clearCurrency() {
      
      currency_ = getDefaultInstance().getCurrency();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 结算币种
     * </pre>
     *
     * <code>string Currency = 1;</code>
     */
    public Builder setCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currency_ = value;
      onChanged();
      return this;
    }

    private double publishPrice_ ;
    /**
     * <pre>
     * 票面价
     * </pre>
     *
     * <code>double PublishPrice = 2;</code>
     */
    public double getPublishPrice() {
      return publishPrice_;
    }
    /**
     * <pre>
     * 票面价
     * </pre>
     *
     * <code>double PublishPrice = 2;</code>
     */
    public Builder setPublishPrice(double value) {
      
      publishPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 票面价
     * </pre>
     *
     * <code>double PublishPrice = 2;</code>
     */
    public Builder clearPublishPrice() {
      
      publishPrice_ = 0D;
      onChanged();
      return this;
    }

    private double exchangeRate_ ;
    /**
     * <pre>
     * 结算币种到销售币种间的汇率
     * </pre>
     *
     * <code>double ExchangeRate = 3;</code>
     */
    public double getExchangeRate() {
      return exchangeRate_;
    }
    /**
     * <pre>
     * 结算币种到销售币种间的汇率
     * </pre>
     *
     * <code>double ExchangeRate = 3;</code>
     */
    public Builder setExchangeRate(double value) {
      
      exchangeRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 结算币种到销售币种间的汇率
     * </pre>
     *
     * <code>double ExchangeRate = 3;</code>
     */
    public Builder clearExchangeRate() {
      
      exchangeRate_ = 0D;
      onChanged();
      return this;
    }

    private double seatPrice_ ;
    /**
     * <pre>
     * 坐席价
     * </pre>
     *
     * <code>double SeatPrice = 4;</code>
     */
    public double getSeatPrice() {
      return seatPrice_;
    }
    /**
     * <pre>
     * 坐席价
     * </pre>
     *
     * <code>double SeatPrice = 4;</code>
     */
    public Builder setSeatPrice(double value) {
      
      seatPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 坐席价
     * </pre>
     *
     * <code>double SeatPrice = 4;</code>
     */
    public Builder clearSeatPrice() {
      
      seatPrice_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SettlementCurrencyPriceDetailType>
      PARSER = new com.google.protobuf.AbstractParser<SettlementCurrencyPriceDetailType>() {
    @java.lang.Override
    public SettlementCurrencyPriceDetailType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SettlementCurrencyPriceDetailType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SettlementCurrencyPriceDetailType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SettlementCurrencyPriceDetailType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.SettlementCurrencyPriceDetailType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

