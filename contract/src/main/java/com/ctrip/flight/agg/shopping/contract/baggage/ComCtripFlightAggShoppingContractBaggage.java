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
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageExtension_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageExtension_fieldAccessorTable;
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
      "act.baggage.PaxBaggageType\"\372\001\n\016PaxBaggag" +
      "eType\022\024\n\014AgeTypeGroup\030\001 \001(\005\022R\n\nBaggageWa" +
      "y\030\002 \003(\0132>.com.ctrip.flight.agg.shopping." +
      "contract.baggage.BaggageWayType\022\034\n\024Bagga" +
      "geSpecifiedDesc\030\003 \001(\t\022`\n\023PaxBaggageExten" +
      "sion\030\004 \001(\0132C.com.ctrip.flight.agg.shoppi" +
      "ng.contract.baggage.PaxBaggageExtension\"" +
      "/\n\023PaxBaggageExtension\022\030\n\020HandBagMaxWeig" +
      "ht\030\001 \001(\001\"6\n\016BaggageWayType\022\026\n\016BaggageTyp" +
      "eRef\030\001 \001(\005\022\014\n\004Type\030\002 \001(\005\"\262\002\n\013BaggageType" +
      "\022\016\n\006RefNum\030\001 \001(\005\022X\n\rBaggageDetail\030\002 \003(\0132" +
      "A.com.ctrip.flight.agg.shopping.contract" +
      ".baggage.BaggageDetailType\022c\n\017ExtensionF" +
      "ields\030\003 \001(\0132J.com.ctrip.flight.agg.shopp" +
      "ing.contract.baggage.BaggageExtensionFie" +
      "ldsType\022T\n\013BaggageSize\030\004 \001(\0132?.com.ctrip" +
      ".flight.agg.shopping.contract.baggage.Ba" +
      "ggageSizeType\"T\n\021BaggageDetailType\022\016\n\006Am" +
      "ount\030\001 \001(\005\022\014\n\004Unit\030\002 \001(\t\022\014\n\004Type\030\003 \001(\t\022\023" +
      "\n\013ExactAmount\030\004 \001(\001\"D\n\017BaggageSizeType\022\025" +
      "\n\rSizeLimitType\030\001 \001(\005\022\014\n\004Size\030\002 \001(\t\022\014\n\004U" +
      "nit\030\003 \001(\t\"_\n\032BaggageExtensionFieldsType\022" +
      "\032\n\022ContainFreeBaggage\030\001 \001(\010\022\022\n\nBaggageGL" +
      "B\030\002 \001(\t\022\021\n\tBaggageCN\030\003 \001(\tB2\n.com.ctrip." +
      "flight.agg.shopping.contract.baggageP\001b\006" +
      "proto3"
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
        new java.lang.String[] { "AgeTypeGroup", "BaggageWay", "BaggageSpecifiedDesc", "PaxBaggageExtension", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageExtension_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageExtension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_PaxBaggageExtension_descriptor,
        new java.lang.String[] { "HandBagMaxWeight", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageWayType_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageWayType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageWayType_descriptor,
        new java.lang.String[] { "BaggageTypeRef", "Type", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageType_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageType_descriptor,
        new java.lang.String[] { "RefNum", "BaggageDetail", "ExtensionFields", "BaggageSize", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageDetailType_descriptor,
        new java.lang.String[] { "Amount", "Unit", "Type", "ExactAmount", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageSizeType_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageSizeType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageSizeType_descriptor,
        new java.lang.String[] { "SizeLimitType", "Size", "Unit", });
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageExtensionFieldsType_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageExtensionFieldsType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_baggage_BaggageExtensionFieldsType_descriptor,
        new java.lang.String[] { "ContainFreeBaggage", "BaggageGLB", "BaggageCN", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
