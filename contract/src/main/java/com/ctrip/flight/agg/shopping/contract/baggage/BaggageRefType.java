// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.baggage.proto

package com.ctrip.flight.agg.shopping.contract.baggage;

/**
 * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType}
 */
public  final class BaggageRefType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType)
    BaggageRefTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BaggageRefType.newBuilder() to construct.
  private BaggageRefType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BaggageRefType() {
    transportRef_ = 0;
    paxBaggage_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BaggageRefType(
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

            transportRef_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              paxBaggage_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType>();
              mutable_bitField0_ |= 0x00000002;
            }
            paxBaggage_.add(
                input.readMessage(com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.parser(), extensionRegistry));
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
        paxBaggage_ = java.util.Collections.unmodifiableList(paxBaggage_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType.class, com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSPORTREF_FIELD_NUMBER = 1;
  private int transportRef_;
  /**
   * <pre>
   * (航班/火车/巴士等) 详情索引号
   * </pre>
   *
   * <code>int32 TransportRef = 1;</code>
   */
  public int getTransportRef() {
    return transportRef_;
  }

  public static final int PAXBAGGAGE_FIELD_NUMBER = 2;
  private java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType> paxBaggage_;
  /**
   * <pre>
   * 乘客的行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
   */
  public java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType> getPaxBaggageList() {
    return paxBaggage_;
  }
  /**
   * <pre>
   * 乘客的行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
   */
  public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageTypeOrBuilder> 
      getPaxBaggageOrBuilderList() {
    return paxBaggage_;
  }
  /**
   * <pre>
   * 乘客的行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
   */
  public int getPaxBaggageCount() {
    return paxBaggage_.size();
  }
  /**
   * <pre>
   * 乘客的行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType getPaxBaggage(int index) {
    return paxBaggage_.get(index);
  }
  /**
   * <pre>
   * 乘客的行李信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
   */
  public com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageTypeOrBuilder getPaxBaggageOrBuilder(
      int index) {
    return paxBaggage_.get(index);
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
    if (transportRef_ != 0) {
      output.writeInt32(1, transportRef_);
    }
    for (int i = 0; i < paxBaggage_.size(); i++) {
      output.writeMessage(2, paxBaggage_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transportRef_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, transportRef_);
    }
    for (int i = 0; i < paxBaggage_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, paxBaggage_.get(i));
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
    if (!(obj instanceof com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType)) {
      return super.equals(obj);
    }
    com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType other = (com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType) obj;

    boolean result = true;
    result = result && (getTransportRef()
        == other.getTransportRef());
    result = result && getPaxBaggageList()
        .equals(other.getPaxBaggageList());
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
    hash = (37 * hash) + TRANSPORTREF_FIELD_NUMBER;
    hash = (53 * hash) + getTransportRef();
    if (getPaxBaggageCount() > 0) {
      hash = (37 * hash) + PAXBAGGAGE_FIELD_NUMBER;
      hash = (53 * hash) + getPaxBaggageList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parseFrom(
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
  public static Builder newBuilder(com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType prototype) {
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
   * Protobuf type {@code com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType)
      com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType.class, com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType.Builder.class);
    }

    // Construct using com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType.newBuilder()
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
        getPaxBaggageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      transportRef_ = 0;

      if (paxBaggageBuilder_ == null) {
        paxBaggage_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        paxBaggageBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.flight.agg.shopping.contract.baggage.ComCtripFlightAggShoppingContractBaggage.internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_descriptor;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType getDefaultInstanceForType() {
      return com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType build() {
      com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType buildPartial() {
      com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType result = new com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.transportRef_ = transportRef_;
      if (paxBaggageBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          paxBaggage_ = java.util.Collections.unmodifiableList(paxBaggage_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.paxBaggage_ = paxBaggage_;
      } else {
        result.paxBaggage_ = paxBaggageBuilder_.build();
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
      if (other instanceof com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType) {
        return mergeFrom((com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType other) {
      if (other == com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType.getDefaultInstance()) return this;
      if (other.getTransportRef() != 0) {
        setTransportRef(other.getTransportRef());
      }
      if (paxBaggageBuilder_ == null) {
        if (!other.paxBaggage_.isEmpty()) {
          if (paxBaggage_.isEmpty()) {
            paxBaggage_ = other.paxBaggage_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePaxBaggageIsMutable();
            paxBaggage_.addAll(other.paxBaggage_);
          }
          onChanged();
        }
      } else {
        if (!other.paxBaggage_.isEmpty()) {
          if (paxBaggageBuilder_.isEmpty()) {
            paxBaggageBuilder_.dispose();
            paxBaggageBuilder_ = null;
            paxBaggage_ = other.paxBaggage_;
            bitField0_ = (bitField0_ & ~0x00000002);
            paxBaggageBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPaxBaggageFieldBuilder() : null;
          } else {
            paxBaggageBuilder_.addAllMessages(other.paxBaggage_);
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
      com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int transportRef_ ;
    /**
     * <pre>
     * (航班/火车/巴士等) 详情索引号
     * </pre>
     *
     * <code>int32 TransportRef = 1;</code>
     */
    public int getTransportRef() {
      return transportRef_;
    }
    /**
     * <pre>
     * (航班/火车/巴士等) 详情索引号
     * </pre>
     *
     * <code>int32 TransportRef = 1;</code>
     */
    public Builder setTransportRef(int value) {
      
      transportRef_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (航班/火车/巴士等) 详情索引号
     * </pre>
     *
     * <code>int32 TransportRef = 1;</code>
     */
    public Builder clearTransportRef() {
      
      transportRef_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType> paxBaggage_ =
      java.util.Collections.emptyList();
    private void ensurePaxBaggageIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        paxBaggage_ = new java.util.ArrayList<com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType>(paxBaggage_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageTypeOrBuilder> paxBaggageBuilder_;

    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType> getPaxBaggageList() {
      if (paxBaggageBuilder_ == null) {
        return java.util.Collections.unmodifiableList(paxBaggage_);
      } else {
        return paxBaggageBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public int getPaxBaggageCount() {
      if (paxBaggageBuilder_ == null) {
        return paxBaggage_.size();
      } else {
        return paxBaggageBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType getPaxBaggage(int index) {
      if (paxBaggageBuilder_ == null) {
        return paxBaggage_.get(index);
      } else {
        return paxBaggageBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder setPaxBaggage(
        int index, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType value) {
      if (paxBaggageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxBaggageIsMutable();
        paxBaggage_.set(index, value);
        onChanged();
      } else {
        paxBaggageBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder setPaxBaggage(
        int index, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder builderForValue) {
      if (paxBaggageBuilder_ == null) {
        ensurePaxBaggageIsMutable();
        paxBaggage_.set(index, builderForValue.build());
        onChanged();
      } else {
        paxBaggageBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder addPaxBaggage(com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType value) {
      if (paxBaggageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxBaggageIsMutable();
        paxBaggage_.add(value);
        onChanged();
      } else {
        paxBaggageBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder addPaxBaggage(
        int index, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType value) {
      if (paxBaggageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaxBaggageIsMutable();
        paxBaggage_.add(index, value);
        onChanged();
      } else {
        paxBaggageBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder addPaxBaggage(
        com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder builderForValue) {
      if (paxBaggageBuilder_ == null) {
        ensurePaxBaggageIsMutable();
        paxBaggage_.add(builderForValue.build());
        onChanged();
      } else {
        paxBaggageBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder addPaxBaggage(
        int index, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder builderForValue) {
      if (paxBaggageBuilder_ == null) {
        ensurePaxBaggageIsMutable();
        paxBaggage_.add(index, builderForValue.build());
        onChanged();
      } else {
        paxBaggageBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder addAllPaxBaggage(
        java.lang.Iterable<? extends com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType> values) {
      if (paxBaggageBuilder_ == null) {
        ensurePaxBaggageIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paxBaggage_);
        onChanged();
      } else {
        paxBaggageBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder clearPaxBaggage() {
      if (paxBaggageBuilder_ == null) {
        paxBaggage_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        paxBaggageBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public Builder removePaxBaggage(int index) {
      if (paxBaggageBuilder_ == null) {
        ensurePaxBaggageIsMutable();
        paxBaggage_.remove(index);
        onChanged();
      } else {
        paxBaggageBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder getPaxBaggageBuilder(
        int index) {
      return getPaxBaggageFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageTypeOrBuilder getPaxBaggageOrBuilder(
        int index) {
      if (paxBaggageBuilder_ == null) {
        return paxBaggage_.get(index);  } else {
        return paxBaggageBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public java.util.List<? extends com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageTypeOrBuilder> 
         getPaxBaggageOrBuilderList() {
      if (paxBaggageBuilder_ != null) {
        return paxBaggageBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(paxBaggage_);
      }
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder addPaxBaggageBuilder() {
      return getPaxBaggageFieldBuilder().addBuilder(
          com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.getDefaultInstance());
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder addPaxBaggageBuilder(
        int index) {
      return getPaxBaggageFieldBuilder().addBuilder(
          index, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.getDefaultInstance());
    }
    /**
     * <pre>
     * 乘客的行李信息
     * </pre>
     *
     * <code>repeated .com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType PaxBaggage = 2;</code>
     */
    public java.util.List<com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder> 
         getPaxBaggageBuilderList() {
      return getPaxBaggageFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageTypeOrBuilder> 
        getPaxBaggageFieldBuilder() {
      if (paxBaggageBuilder_ == null) {
        paxBaggageBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageType.Builder, com.ctrip.flight.agg.shopping.contract.baggage.PaxBaggageTypeOrBuilder>(
                paxBaggage_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        paxBaggage_ = null;
      }
      return paxBaggageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType)
  }

  // @@protoc_insertion_point(class_scope:com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType)
  private static final com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType();
  }

  public static com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BaggageRefType>
      PARSER = new com.google.protobuf.AbstractParser<BaggageRefType>() {
    @java.lang.Override
    public BaggageRefType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BaggageRefType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BaggageRefType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BaggageRefType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.flight.agg.shopping.contract.baggage.BaggageRefType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

