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

__all__ = ['BillingGroupArgs', 'BillingGroup']

@pulumi.input_type
class BillingGroupArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input['BillingGroupPropertiesArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a BillingGroup resource.
        :param pulumi.Input[str] name: The name of the Billing Group.
        :param pulumi.Input['BillingGroupPropertiesArgs'] properties: The Billing Group properties. Defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Billing Group.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input['BillingGroupPropertiesArgs']]:
        """
        The Billing Group properties. Defined below.
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input['BillingGroupPropertiesArgs']]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _BillingGroupState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 metadatas: Optional[pulumi.Input[Sequence[pulumi.Input['BillingGroupMetadataArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input['BillingGroupPropertiesArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering BillingGroup resources.
        :param pulumi.Input[str] arn: The ARN of the Billing Group.
        :param pulumi.Input[str] name: The name of the Billing Group.
        :param pulumi.Input['BillingGroupPropertiesArgs'] properties: The Billing Group properties. Defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags
        :param pulumi.Input[int] version: The current version of the Billing Group record in the registry.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if metadatas is not None:
            pulumi.set(__self__, "metadatas", metadatas)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Billing Group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def metadatas(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BillingGroupMetadataArgs']]]]:
        return pulumi.get(self, "metadatas")

    @metadatas.setter
    def metadatas(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BillingGroupMetadataArgs']]]]):
        pulumi.set(self, "metadatas", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Billing Group.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input['BillingGroupPropertiesArgs']]:
        """
        The Billing Group properties. Defined below.
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input['BillingGroupPropertiesArgs']]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        The current version of the Billing Group record in the registry.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class BillingGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[pulumi.InputType['BillingGroupPropertiesArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages an AWS IoT Billing Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.BillingGroup("example",
            name="example",
            properties=aws.iot.BillingGroupPropertiesArgs(
                description="This is my billing group",
            ),
            tags={
                "terraform": "true",
            })
        ```

        ## Import

        Using `pulumi import`, import IoT Billing Groups using the name. For example:

        ```sh
        $ pulumi import aws:iot/billingGroup:BillingGroup example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the Billing Group.
        :param pulumi.Input[pulumi.InputType['BillingGroupPropertiesArgs']] properties: The Billing Group properties. Defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BillingGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an AWS IoT Billing Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.BillingGroup("example",
            name="example",
            properties=aws.iot.BillingGroupPropertiesArgs(
                description="This is my billing group",
            ),
            tags={
                "terraform": "true",
            })
        ```

        ## Import

        Using `pulumi import`, import IoT Billing Groups using the name. For example:

        ```sh
        $ pulumi import aws:iot/billingGroup:BillingGroup example example
        ```

        :param str resource_name: The name of the resource.
        :param BillingGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BillingGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[pulumi.InputType['BillingGroupPropertiesArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BillingGroupArgs.__new__(BillingGroupArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["properties"] = properties
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["metadatas"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["version"] = None
        super(BillingGroup, __self__).__init__(
            'aws:iot/billingGroup:BillingGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            metadatas: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BillingGroupMetadataArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            properties: Optional[pulumi.Input[pulumi.InputType['BillingGroupPropertiesArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'BillingGroup':
        """
        Get an existing BillingGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the Billing Group.
        :param pulumi.Input[str] name: The name of the Billing Group.
        :param pulumi.Input[pulumi.InputType['BillingGroupPropertiesArgs']] properties: The Billing Group properties. Defined below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags
        :param pulumi.Input[int] version: The current version of the Billing Group record in the registry.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BillingGroupState.__new__(_BillingGroupState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["metadatas"] = metadatas
        __props__.__dict__["name"] = name
        __props__.__dict__["properties"] = properties
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["version"] = version
        return BillingGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Billing Group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def metadatas(self) -> pulumi.Output[Sequence['outputs.BillingGroupMetadata']]:
        return pulumi.get(self, "metadatas")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Billing Group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def properties(self) -> pulumi.Output[Optional['outputs.BillingGroupProperties']]:
        """
        The Billing Group properties. Defined below.
        """
        return pulumi.get(self, "properties")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        The current version of the Billing Group record in the registry.
        """
        return pulumi.get(self, "version")

