// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.baggage.proto

package com.ctrip.flight.agg.shopping.contract.baggage;

public final class ComCtripFlightAggShoppingContractBaggage {
  private ComCtripFlightAggShoppingContractBaggage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageWayType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageWayType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageSizeType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageSizeType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageExtensionFieldsType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageExtensionFieldsType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4com.ctrip.flight.agg.shopping.contract" +
      ".baggage.proto\022.com.ctrip.flight.agg.sho" +
      "pping.contract.baggage\"z\n\016BaggageRefType" +
      "\022\024\n\014TransportRef\030\001 \001(\005\022R\n\nPaxBaggage\030\002 \003" +
      "(\0132>.com.ctrip.flight.agg.shopping.contr" +
      "act.baggage.PaxBaggageType\"\230\001\n\016PaxBaggag" +
      "eType\022\024\n\014AgeTypeGroup\030\001 \001(\005\022R\n\nBaggageWa" +
      "y\030\002 \003(\0132>.com.ctrip.flight.agg.shopping." +
      "contract.baggage.BaggageWayType\022\034\n\024Bagga" +
      "geSpecifiedDesc\030\003 \001(\t\"6\n\016BaggageWayType\022" +
      "\026\n\016BaggageTypeRef\030\001 \001(\005\022\014\n\004Type\030\002 \001(\005\"\262\002" +
      "\n\013BaggageType\022\016\n\006RefNum\030\001 \001(\005\022X\n\rBaggage" +
      "Detail\030\002 \003(\0132A.com.ctrip.flight.agg.shop" +
      "ping.contract.baggage.BaggageDetailType\022" +
      "c\n\017ExtensionFields\030\003 \001(\0132J.com.ctrip.fli" +
      "ght.agg.shopping.contract.baggage.Baggag" +
      "eExtensionFieldsType\022T\n\013BaggageSize\030\004 \001(" +
      "\0132?.com.ctrip.flight.agg.shopping.contra" +
      "ct.baggage.BaggageSizeType\"?\n\021BaggageDet" +
      "ailType\022\016\n\006Amount\030\001 \001(\005\022\014\n\004Unit\030\002 \001(\t\022\014\n" +
      "\004Type\030\003 \001(\t\"D\n\017BaggageSizeType\022\025\n\rSizeLi" +
      "mitType\030\001 \001(\005\022\014\n\004Size\030\002 \001(\t\022\014\n\004Unit\030\003 \001(" +
      "\t\"8\n\032BaggageExtensionFieldsType\022\032\n\022Conta" +
      "inFreeBaggage\030\001 \001(\010B2\n.com.ctrip.flight." +
      "agg.shopping.contract.baggageP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageRefType_descriptor,
        new java.lang.String[] { "TransportRef", "PaxBaggage", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageType_descriptor,
        new java.lang.String[] { "AgeTypeGroup", "BaggageWay", "BaggageSpecifiedDesc", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageWayType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageWayType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageWayType_descriptor,
        new java.lang.String[] { "BaggageTypeRef", "Type", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageType_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageType_descriptor,
        new java.lang.String[] { "RefNum", "BaggageDetail", "ExtensionFields", "BaggageSize", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_descriptor,
        new java.lang.String[] { "Amount", "Unit", "Type", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageSizeType_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageSizeType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageSizeType_descriptor,
        new java.lang.String[] { "SizeLimitType", "Size", "Unit", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageExtensionFieldsType_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageExtensionFieldsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageExtensionFieldsType_descriptor,
        new java.lang.String[] { "ContainFreeBaggage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
