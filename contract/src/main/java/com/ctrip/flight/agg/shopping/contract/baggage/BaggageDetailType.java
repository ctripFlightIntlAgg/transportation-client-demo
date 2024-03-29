// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.baggage.proto

package com.ctrip.flight.agg.shopping.contract.baggage;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType}
 */
public  final class BaggageDetailType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType)
    BaggageDetailTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BaggageDetailType.newBuilder() to construct.
  private BaggageDetailType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BaggageDetailType() {
    amount_ = 0;
    unit_ = "";
    type_ = "";
    exactAmount_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BaggageDetailType(
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
          case 8: {

            amount_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            unit_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 33: {

            exactAmount_ = input.readDouble();
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
    return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType.class, com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private int amount_;
  /**
   * <pre>
   * -1表示不限制
   * </pre>
   *
   * <code>int32 Amount = 1;</code>
   */
  public int getAmount() {
    return amount_;
  }

  public static final int UNIT_FIELD_NUMBER = 2;
  private volatile java.lang.Object unit_;
  /**
   * <pre>
   * PC、KG
   * </pre>
   *
   * <code>string Unit = 2;</code>
   */
  public java.lang.String getUnit() {
    java.lang.Object ref = unit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unit_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * PC、KG
   * </pre>
   *
   * <code>string Unit = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUnitBytes() {
    java.lang.Object ref = unit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * Piece、Weight、TotalWeight
   * </pre>
   *
   * <code>string Type = 3;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Piece、Weight、TotalWeight
   * </pre>
   *
   * <code>string Type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXACTAMOUNT_FIELD_NUMBER = 4;
  private double exactAmount_;
  /**
   * <pre>
   * 支持浮点的确切数量 -1表示不限制
   * </pre>
   *
   * <code>double ExactAmount = 4;</code>
   */
  public double getExactAmount() {
    return exactAmount_;
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
    if (amount_ != 0) {
      output.writeInt32(1, amount_);
    }
    if (!getUnitBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, unit_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (exactAmount_ != 0D) {
      output.writeDouble(4, exactAmount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, amount_);
    }
    if (!getUnitBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, unit_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (exactAmount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, exactAmount_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType other = (com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType) obj;

    boolean result = true;
    result = result && (getAmount()
        == other.getAmount());
    result = result && getUnit()
        .equals(other.getUnit());
    result = result && getType()
        .equals(other.getType());
    result = result && (
        java.lang.Double.doubleToLongBits(getExactAmount())
        == java.lang.Double.doubleToLongBits(
            other.getExactAmount()));
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + getUnit().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + EXACTAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getExactAmount()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType)
      com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType.class, com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType.newBuilder()
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
      amount_ = 0;

      unit_ = "";

      type_ = "";

      exactAmount_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType build() {
      com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType result = new com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType(this);
      result.amount_ = amount_;
      result.unit_ = unit_;
      result.type_ = type_;
      result.exactAmount_ = exactAmount_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType.getDefaultInstance()) return this;
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
      }
      if (!other.getUnit().isEmpty()) {
        unit_ = other.unit_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.getExactAmount() != 0D) {
        setExactAmount(other.getExactAmount());
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
      com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int amount_ ;
    /**
     * <pre>
     * -1表示不限制
     * </pre>
     *
     * <code>int32 Amount = 1;</code>
     */
    public int getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * -1表示不限制
     * </pre>
     *
     * <code>int32 Amount = 1;</code>
     */
    public Builder setAmount(int value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * -1表示不限制
     * </pre>
     *
     * <code>int32 Amount = 1;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object unit_ = "";
    /**
     * <pre>
     * PC、KG
     * </pre>
     *
     * <code>string Unit = 2;</code>
     */
    public java.lang.String getUnit() {
      java.lang.Object ref = unit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * PC、KG
     * </pre>
     *
     * <code>string Unit = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUnitBytes() {
      java.lang.Object ref = unit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * PC、KG
     * </pre>
     *
     * <code>string Unit = 2;</code>
     */
    public Builder setUnit(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * PC、KG
     * </pre>
     *
     * <code>string Unit = 2;</code>
     */
    public Builder clearUnit() {
      
      unit_ = getDefaultInstance().getUnit();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * PC、KG
     * </pre>
     *
     * <code>string Unit = 2;</code>
     */
    public Builder setUnitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      unit_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * Piece、Weight、TotalWeight
     * </pre>
     *
     * <code>string Type = 3;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Piece、Weight、TotalWeight
     * </pre>
     *
     * <code>string Type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Piece、Weight、TotalWeight
     * </pre>
     *
     * <code>string Type = 3;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Piece、Weight、TotalWeight
     * </pre>
     *
     * <code>string Type = 3;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Piece、Weight、TotalWeight
     * </pre>
     *
     * <code>string Type = 3;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private double exactAmount_ ;
    /**
     * <pre>
     * 支持浮点的确切数量 -1表示不限制
     * </pre>
     *
     * <code>double ExactAmount = 4;</code>
     */
    public double getExactAmount() {
      return exactAmount_;
    }
    /**
     * <pre>
     * 支持浮点的确切数量 -1表示不限制
     * </pre>
     *
     * <code>double ExactAmount = 4;</code>
     */
    public Builder setExactAmount(double value) {
      
      exactAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 支持浮点的确切数量 -1表示不限制
     * </pre>
     *
     * <code>double ExactAmount = 4;</code>
     */
    public Builder clearExactAmount() {
      
      exactAmount_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType)
  private static final com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType();
  }

  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BaggageDetailType>
      PARSER = new com.google.protobuf.AbstractParser<BaggageDetailType>() {
    @java.lang.Override
    public BaggageDetailType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BaggageDetailType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BaggageDetailType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BaggageDetailType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.baggage.BaggageDetailType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

