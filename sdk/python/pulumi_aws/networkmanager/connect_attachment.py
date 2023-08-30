# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ConnectAttachmentArgs', 'ConnectAttachment']

@pulumi.input_type
class ConnectAttachmentArgs:
    def __init__(__self__, *,
                 core_network_id: pulumi.Input[str],
                 edge_location: pulumi.Input[str],
                 options: pulumi.Input['ConnectAttachmentOptionsArgs'],
                 transport_attachment_id: pulumi.Input[str],
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ConnectAttachment resource.
        :param pulumi.Input[str] core_network_id: The ID of a core network where you want to create the attachment.
        :param pulumi.Input[str] edge_location: The Region where the edge is located.
        :param pulumi.Input['ConnectAttachmentOptionsArgs'] options: Options for creating an attachment.
               
               The following arguments are optional:
        :param pulumi.Input[str] transport_attachment_id: The ID of the attachment between the two connections.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "core_network_id", core_network_id)
        pulumi.set(__self__, "edge_location", edge_location)
        pulumi.set(__self__, "options", options)
        pulumi.set(__self__, "transport_attachment_id", transport_attachment_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="coreNetworkId")
    def core_network_id(self) -> pulumi.Input[str]:
        """
        The ID of a core network where you want to create the attachment.
        """
        return pulumi.get(self, "core_network_id")

    @core_network_id.setter
    def core_network_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "core_network_id", value)

    @property
    @pulumi.getter(name="edgeLocation")
    def edge_location(self) -> pulumi.Input[str]:
        """
        The Region where the edge is located.
        """
        return pulumi.get(self, "edge_location")

    @edge_location.setter
    def edge_location(self, value: pulumi.Input[str]):
        pulumi.set(self, "edge_location", value)

    @property
    @pulumi.getter
    def options(self) -> pulumi.Input['ConnectAttachmentOptionsArgs']:
        """
        Options for creating an attachment.

        The following arguments are optional:
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: pulumi.Input['ConnectAttachmentOptionsArgs']):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter(name="transportAttachmentId")
    def transport_attachment_id(self) -> pulumi.Input[str]:
        """
        The ID of the attachment between the two connections.
        """
        return pulumi.get(self, "transport_attachment_id")

    @transport_attachment_id.setter
    def transport_attachment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transport_attachment_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ConnectAttachmentState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 attachment_id: Optional[pulumi.Input[str]] = None,
                 attachment_policy_rule_number: Optional[pulumi.Input[int]] = None,
                 attachment_type: Optional[pulumi.Input[str]] = None,
                 core_network_arn: Optional[pulumi.Input[str]] = None,
                 core_network_id: Optional[pulumi.Input[str]] = None,
                 edge_location: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input['ConnectAttachmentOptionsArgs']] = None,
                 owner_account_id: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 segment_name: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 transport_attachment_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ConnectAttachment resources.
        :param pulumi.Input[str] arn: The ARN of the attachment.
        :param pulumi.Input[int] attachment_policy_rule_number: The policy rule number associated with the attachment.
        :param pulumi.Input[str] attachment_type: The type of attachment.
        :param pulumi.Input[str] core_network_arn: The ARN of a core network.
        :param pulumi.Input[str] core_network_id: The ID of a core network where you want to create the attachment.
        :param pulumi.Input[str] edge_location: The Region where the edge is located.
        :param pulumi.Input['ConnectAttachmentOptionsArgs'] options: Options for creating an attachment.
               
               The following arguments are optional:
        :param pulumi.Input[str] owner_account_id: The ID of the attachment account owner.
        :param pulumi.Input[str] resource_arn: The attachment resource ARN.
        :param pulumi.Input[str] segment_name: The name of the segment attachment.
        :param pulumi.Input[str] state: The state of the attachment.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] transport_attachment_id: The ID of the attachment between the two connections.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if attachment_id is not None:
            pulumi.set(__self__, "attachment_id", attachment_id)
        if attachment_policy_rule_number is not None:
            pulumi.set(__self__, "attachment_policy_rule_number", attachment_policy_rule_number)
        if attachment_type is not None:
            pulumi.set(__self__, "attachment_type", attachment_type)
        if core_network_arn is not None:
            pulumi.set(__self__, "core_network_arn", core_network_arn)
        if core_network_id is not None:
            pulumi.set(__self__, "core_network_id", core_network_id)
        if edge_location is not None:
            pulumi.set(__self__, "edge_location", edge_location)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if owner_account_id is not None:
            pulumi.set(__self__, "owner_account_id", owner_account_id)
        if resource_arn is not None:
            pulumi.set(__self__, "resource_arn", resource_arn)
        if segment_name is not None:
            pulumi.set(__self__, "segment_name", segment_name)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if transport_attachment_id is not None:
            pulumi.set(__self__, "transport_attachment_id", transport_attachment_id)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the attachment.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="attachmentId")
    def attachment_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "attachment_id")

    @attachment_id.setter
    def attachment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "attachment_id", value)

    @property
    @pulumi.getter(name="attachmentPolicyRuleNumber")
    def attachment_policy_rule_number(self) -> Optional[pulumi.Input[int]]:
        """
        The policy rule number associated with the attachment.
        """
        return pulumi.get(self, "attachment_policy_rule_number")

    @attachment_policy_rule_number.setter
    def attachment_policy_rule_number(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "attachment_policy_rule_number", value)

    @property
    @pulumi.getter(name="attachmentType")
    def attachment_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of attachment.
        """
        return pulumi.get(self, "attachment_type")

    @attachment_type.setter
    def attachment_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "attachment_type", value)

    @property
    @pulumi.getter(name="coreNetworkArn")
    def core_network_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of a core network.
        """
        return pulumi.get(self, "core_network_arn")

    @core_network_arn.setter
    def core_network_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "core_network_arn", value)

    @property
    @pulumi.getter(name="coreNetworkId")
    def core_network_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of a core network where you want to create the attachment.
        """
        return pulumi.get(self, "core_network_id")

    @core_network_id.setter
    def core_network_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "core_network_id", value)

    @property
    @pulumi.getter(name="edgeLocation")
    def edge_location(self) -> Optional[pulumi.Input[str]]:
        """
        The Region where the edge is located.
        """
        return pulumi.get(self, "edge_location")

    @edge_location.setter
    def edge_location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "edge_location", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input['ConnectAttachmentOptionsArgs']]:
        """
        Options for creating an attachment.

        The following arguments are optional:
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input['ConnectAttachmentOptionsArgs']]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter(name="ownerAccountId")
    def owner_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the attachment account owner.
        """
        return pulumi.get(self, "owner_account_id")

    @owner_account_id.setter
    def owner_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_account_id", value)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The attachment resource ARN.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter(name="segmentName")
    def segment_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the segment attachment.
        """
        return pulumi.get(self, "segment_name")

    @segment_name.setter
    def segment_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "segment_name", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the attachment.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="transportAttachmentId")
    def transport_attachment_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the attachment between the two connections.
        """
        return pulumi.get(self, "transport_attachment_id")

    @transport_attachment_id.setter
    def transport_attachment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transport_attachment_id", value)


class ConnectAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 core_network_id: Optional[pulumi.Input[str]] = None,
                 edge_location: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[pulumi.InputType['ConnectAttachmentOptionsArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 transport_attachment_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS NetworkManager ConnectAttachment.

        ## Example Usage

        ## Import

        Using `pulumi import`, import `aws_networkmanager_connect_attachment` using the attachment ID. For example:

        ```sh
         $ pulumi import aws:networkmanager/connectAttachment:ConnectAttachment example attachment-0f8fa60d2238d1bd8
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] core_network_id: The ID of a core network where you want to create the attachment.
        :param pulumi.Input[str] edge_location: The Region where the edge is located.
        :param pulumi.Input[pulumi.InputType['ConnectAttachmentOptionsArgs']] options: Options for creating an attachment.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] transport_attachment_id: The ID of the attachment between the two connections.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS NetworkManager ConnectAttachment.

        ## Example Usage

        ## Import

        Using `pulumi import`, import `aws_networkmanager_connect_attachment` using the attachment ID. For example:

        ```sh
         $ pulumi import aws:networkmanager/connectAttachment:ConnectAttachment example attachment-0f8fa60d2238d1bd8
        ```

        :param str resource_name: The name of the resource.
        :param ConnectAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 core_network_id: Optional[pulumi.Input[str]] = None,
                 edge_location: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[pulumi.InputType['ConnectAttachmentOptionsArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 transport_attachment_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConnectAttachmentArgs.__new__(ConnectAttachmentArgs)

            if core_network_id is None and not opts.urn:
                raise TypeError("Missing required property 'core_network_id'")
            __props__.__dict__["core_network_id"] = core_network_id
            if edge_location is None and not opts.urn:
                raise TypeError("Missing required property 'edge_location'")
            __props__.__dict__["edge_location"] = edge_location
            if options is None and not opts.urn:
                raise TypeError("Missing required property 'options'")
            __props__.__dict__["options"] = options
            __props__.__dict__["tags"] = tags
            if transport_attachment_id is None and not opts.urn:
                raise TypeError("Missing required property 'transport_attachment_id'")
            __props__.__dict__["transport_attachment_id"] = transport_attachment_id
            __props__.__dict__["arn"] = None
            __props__.__dict__["attachment_id"] = None
            __props__.__dict__["attachment_policy_rule_number"] = None
            __props__.__dict__["attachment_type"] = None
            __props__.__dict__["core_network_arn"] = None
            __props__.__dict__["owner_account_id"] = None
            __props__.__dict__["resource_arn"] = None
            __props__.__dict__["segment_name"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["tags_all"] = None
        super(ConnectAttachment, __self__).__init__(
            'aws:networkmanager/connectAttachment:ConnectAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            attachment_id: Optional[pulumi.Input[str]] = None,
            attachment_policy_rule_number: Optional[pulumi.Input[int]] = None,
            attachment_type: Optional[pulumi.Input[str]] = None,
            core_network_arn: Optional[pulumi.Input[str]] = None,
            core_network_id: Optional[pulumi.Input[str]] = None,
            edge_location: Optional[pulumi.Input[str]] = None,
            options: Optional[pulumi.Input[pulumi.InputType['ConnectAttachmentOptionsArgs']]] = None,
            owner_account_id: Optional[pulumi.Input[str]] = None,
            resource_arn: Optional[pulumi.Input[str]] = None,
            segment_name: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            transport_attachment_id: Optional[pulumi.Input[str]] = None) -> 'ConnectAttachment':
        """
        Get an existing ConnectAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the attachment.
        :param pulumi.Input[int] attachment_policy_rule_number: The policy rule number associated with the attachment.
        :param pulumi.Input[str] attachment_type: The type of attachment.
        :param pulumi.Input[str] core_network_arn: The ARN of a core network.
        :param pulumi.Input[str] core_network_id: The ID of a core network where you want to create the attachment.
        :param pulumi.Input[str] edge_location: The Region where the edge is located.
        :param pulumi.Input[pulumi.InputType['ConnectAttachmentOptionsArgs']] options: Options for creating an attachment.
               
               The following arguments are optional:
        :param pulumi.Input[str] owner_account_id: The ID of the attachment account owner.
        :param pulumi.Input[str] resource_arn: The attachment resource ARN.
        :param pulumi.Input[str] segment_name: The name of the segment attachment.
        :param pulumi.Input[str] state: The state of the attachment.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] transport_attachment_id: The ID of the attachment between the two connections.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectAttachmentState.__new__(_ConnectAttachmentState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["attachment_id"] = attachment_id
        __props__.__dict__["attachment_policy_rule_number"] = attachment_policy_rule_number
        __props__.__dict__["attachment_type"] = attachment_type
        __props__.__dict__["core_network_arn"] = core_network_arn
        __props__.__dict__["core_network_id"] = core_network_id
        __props__.__dict__["edge_location"] = edge_location
        __props__.__dict__["options"] = options
        __props__.__dict__["owner_account_id"] = owner_account_id
        __props__.__dict__["resource_arn"] = resource_arn
        __props__.__dict__["segment_name"] = segment_name
        __props__.__dict__["state"] = state
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["transport_attachment_id"] = transport_attachment_id
        return ConnectAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the attachment.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="attachmentId")
    def attachment_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "attachment_id")

    @property
    @pulumi.getter(name="attachmentPolicyRuleNumber")
    def attachment_policy_rule_number(self) -> pulumi.Output[int]:
        """
        The policy rule number associated with the attachment.
        """
        return pulumi.get(self, "attachment_policy_rule_number")

    @property
    @pulumi.getter(name="attachmentType")
    def attachment_type(self) -> pulumi.Output[str]:
        """
        The type of attachment.
        """
        return pulumi.get(self, "attachment_type")

    @property
    @pulumi.getter(name="coreNetworkArn")
    def core_network_arn(self) -> pulumi.Output[str]:
        """
        The ARN of a core network.
        """
        return pulumi.get(self, "core_network_arn")

    @property
    @pulumi.getter(name="coreNetworkId")
    def core_network_id(self) -> pulumi.Output[str]:
        """
        The ID of a core network where you want to create the attachment.
        """
        return pulumi.get(self, "core_network_id")

    @property
    @pulumi.getter(name="edgeLocation")
    def edge_location(self) -> pulumi.Output[str]:
        """
        The Region where the edge is located.
        """
        return pulumi.get(self, "edge_location")

    @property
    @pulumi.getter
    def options(self) -> pulumi.Output['outputs.ConnectAttachmentOptions']:
        """
        Options for creating an attachment.

        The following arguments are optional:
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter(name="ownerAccountId")
    def owner_account_id(self) -> pulumi.Output[str]:
        """
        The ID of the attachment account owner.
        """
        return pulumi.get(self, "owner_account_id")

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Output[str]:
        """
        The attachment resource ARN.
        """
        return pulumi.get(self, "resource_arn")

    @property
    @pulumi.getter(name="segmentName")
    def segment_name(self) -> pulumi.Output[str]:
        """
        The name of the segment attachment.
        """
        return pulumi.get(self, "segment_name")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The state of the attachment.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="transportAttachmentId")
    def transport_attachment_id(self) -> pulumi.Output[str]:
        """
        The ID of the attachment between the two connections.
        """
        return pulumi.get(self, "transport_attachment_id")

