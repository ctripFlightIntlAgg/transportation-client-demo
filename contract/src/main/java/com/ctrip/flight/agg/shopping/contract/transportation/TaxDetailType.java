// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType}
 */
public  final class TaxDetailType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType)
    TaxDetailTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaxDetailType.newBuilder() to construct.
  private TaxDetailType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaxDetailType() {
    type_ = 0;
    amount_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaxDetailType(
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

            type_ = input.readInt32();
            break;
          }
          case 17: {

            amount_ = input.readDouble();
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
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TaxDetailType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TaxDetailType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * 类型: 0:其他 1:机建  2:燃油
   * type： 0:others 1:airport construction fee  2:fuel surcharge
   * </pre>
   *
   * <code>int32 Type = 1;</code>
   */
  public int getType() {
    return type_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private double amount_;
  /**
   * <pre>
   * 金额
   * amount
   * </pre>
   *
   * <code>double Amount = 2;</code>
   */
  public double getAmount() {
    return amount_;
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
    if (type_ != 0) {
      output.writeInt32(1, type_);
    }
    if (amount_ != 0D) {
      output.writeDouble(2, amount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, type_);
    }
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, amount_);
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType other = (com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType) obj;

    boolean result = true;
    result = result && (getType()
        == other.getType());
    result = result && (
        java.lang.Double.doubleToLongBits(getAmount())
        == java.lang.Double.doubleToLongBits(
            other.getAmount()));
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType)
      com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TaxDetailType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TaxDetailType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType.class, com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType.newBuilder()
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
      type_ = 0;

      amount_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.internal_static_com_ctrip_flight_agg_shopping_contract_transportation_TaxDetailType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType build() {
      com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType result = new com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType(this);
      result.type_ = type_;
      result.amount_ = amount_;
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
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
      com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     * 类型: 0:其他 1:机建  2:燃油
     * type： 0:others 1:airport construction fee  2:fuel surcharge
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     */
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * 类型: 0:其他 1:机建  2:燃油
     * type： 0:others 1:airport construction fee  2:fuel surcharge
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 类型: 0:其他 1:机建  2:燃油
     * type： 0:others 1:airport construction fee  2:fuel surcharge
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <pre>
     * 金额
     * amount
     * </pre>
     *
     * <code>double Amount = 2;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * 金额
     * amount
     * </pre>
     *
     * <code>double Amount = 2;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 金额
     * amount
     * </pre>
     *
     * <code>double Amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType)
  private static final com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType();
  }

  public static com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaxDetailType>
      PARSER = new com.google.protobuf.AbstractParser<TaxDetailType>() {
    @java.lang.Override
    public TaxDetailType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaxDetailType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaxDetailType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaxDetailType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.transportation.TaxDetailType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

