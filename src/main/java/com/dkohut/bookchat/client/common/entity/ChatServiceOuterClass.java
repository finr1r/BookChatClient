// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatService.proto

package com.dkohut.bookchat.client.common.entity;

public final class ChatServiceOuterClass {
  private ChatServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dkohut_bookchat_client_common_entity_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dkohut_bookchat_client_common_entity_ChatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dkohut_bookchat_client_common_entity_ChatMessageFromServer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dkohut_bookchat_client_common_entity_ChatMessageFromServer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ChatService.proto\022(com.dkohut.bookchat" +
      ".client.common.entity\",\n\013ChatMessage\022\014\n\004" +
      "name\030\001 \001(\t\022\017\n\007message\030\002 \001(\t\"6\n\025ChatMessa" +
      "geFromServer\022\014\n\004name\030\001 \001(\t\022\017\n\007message\030\002 " +
      "\001(\t2\220\001\n\013ChatService\022\200\001\n\004chat\0225.com.dkohu" +
      "t.bookchat.client.common.entity.ChatMess" +
      "age\032?.com.dkohut.bookchat.client.common." +
      "entity.ChatMessageFromServer(\001B\002P\001b\006prot" +
      "o3"
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
    internal_static_com_dkohut_bookchat_client_common_entity_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dkohut_bookchat_client_common_entity_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dkohut_bookchat_client_common_entity_ChatMessage_descriptor,
        new java.lang.String[] { "Name", "Message", });
    internal_static_com_dkohut_bookchat_client_common_entity_ChatMessageFromServer_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_dkohut_bookchat_client_common_entity_ChatMessageFromServer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dkohut_bookchat_client_common_entity_ChatMessageFromServer_descriptor,
        new java.lang.String[] { "Name", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
