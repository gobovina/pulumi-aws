# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VpcIpamScopeArgs', 'VpcIpamScope']

@pulumi.input_type
class VpcIpamScopeArgs:
    def __init__(__self__, *,
                 ipam_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a VpcIpamScope resource.
        :param pulumi.Input[str] ipam_id: The ID of the IPAM for which you're creating this scope.
        :param pulumi.Input[str] description: A description for the scope you're creating.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "ipam_id", ipam_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="ipamId")
    def ipam_id(self) -> pulumi.Input[str]:
        """
        The ID of the IPAM for which you're creating this scope.
        """
        return pulumi.get(self, "ipam_id")

    @ipam_id.setter
    def ipam_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "ipam_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the scope you're creating.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _VpcIpamScopeState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ipam_arn: Optional[pulumi.Input[str]] = None,
                 ipam_id: Optional[pulumi.Input[str]] = None,
                 ipam_scope_type: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 pool_count: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering VpcIpamScope resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the scope.
        :param pulumi.Input[str] description: A description for the scope you're creating.
        :param pulumi.Input[str] ipam_arn: The ARN of the IPAM for which you're creating this scope.
        :param pulumi.Input[str] ipam_id: The ID of the IPAM for which you're creating this scope.
        :param pulumi.Input[bool] is_default: Defines if the scope is the default scope or not.
        :param pulumi.Input[int] pool_count: The number of pools in the scope.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ipam_arn is not None:
            pulumi.set(__self__, "ipam_arn", ipam_arn)
        if ipam_id is not None:
            pulumi.set(__self__, "ipam_id", ipam_id)
        if ipam_scope_type is not None:
            pulumi.set(__self__, "ipam_scope_type", ipam_scope_type)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if pool_count is not None:
            pulumi.set(__self__, "pool_count", pool_count)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the scope.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the scope you're creating.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ipamArn")
    def ipam_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the IPAM for which you're creating this scope.
        """
        return pulumi.get(self, "ipam_arn")

    @ipam_arn.setter
    def ipam_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_arn", value)

    @property
    @pulumi.getter(name="ipamId")
    def ipam_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the IPAM for which you're creating this scope.
        """
        return pulumi.get(self, "ipam_id")

    @ipam_id.setter
    def ipam_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_id", value)

    @property
    @pulumi.getter(name="ipamScopeType")
    def ipam_scope_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipam_scope_type")

    @ipam_scope_type.setter
    def ipam_scope_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipam_scope_type", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Defines if the scope is the default scope or not.
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter(name="poolCount")
    def pool_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of pools in the scope.
        """
        return pulumi.get(self, "pool_count")

    @pool_count.setter
    def pool_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "pool_count", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class VpcIpamScope(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ipam_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Creates a scope for AWS IPAM.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        current = aws.get_region()
        example_vpc_ipam = aws.ec2.VpcIpam("exampleVpcIpam", operating_regions=[aws.ec2.VpcIpamOperatingRegionArgs(
            region_name=current.name,
        )])
        example_vpc_ipam_scope = aws.ec2.VpcIpamScope("exampleVpcIpamScope",
            ipam_id=example_vpc_ipam.id,
            description="Another Scope")
        ```

        ## Import

        Using `pulumi import`, import IPAMs using the `scope_id`. For example:

        ```sh
         $ pulumi import aws:ec2/vpcIpamScope:VpcIpamScope example ipam-scope-0513c69f283d11dfb
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description for the scope you're creating.
        :param pulumi.Input[str] ipam_id: The ID of the IPAM for which you're creating this scope.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcIpamScopeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a scope for AWS IPAM.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_aws as aws

        current = aws.get_region()
        example_vpc_ipam = aws.ec2.VpcIpam("exampleVpcIpam", operating_regions=[aws.ec2.VpcIpamOperatingRegionArgs(
            region_name=current.name,
        )])
        example_vpc_ipam_scope = aws.ec2.VpcIpamScope("exampleVpcIpamScope",
            ipam_id=example_vpc_ipam.id,
            description="Another Scope")
        ```

        ## Import

        Using `pulumi import`, import IPAMs using the `scope_id`. For example:

        ```sh
         $ pulumi import aws:ec2/vpcIpamScope:VpcIpamScope example ipam-scope-0513c69f283d11dfb
        ```

        :param str resource_name: The name of the resource.
        :param VpcIpamScopeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcIpamScopeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ipam_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcIpamScopeArgs.__new__(VpcIpamScopeArgs)

            __props__.__dict__["description"] = description
            if ipam_id is None and not opts.urn:
                raise TypeError("Missing required property 'ipam_id'")
            __props__.__dict__["ipam_id"] = ipam_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["ipam_arn"] = None
            __props__.__dict__["ipam_scope_type"] = None
            __props__.__dict__["is_default"] = None
            __props__.__dict__["pool_count"] = None
            __props__.__dict__["tags_all"] = None
        super(VpcIpamScope, __self__).__init__(
            'aws:ec2/vpcIpamScope:VpcIpamScope',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            ipam_arn: Optional[pulumi.Input[str]] = None,
            ipam_id: Optional[pulumi.Input[str]] = None,
            ipam_scope_type: Optional[pulumi.Input[str]] = None,
            is_default: Optional[pulumi.Input[bool]] = None,
            pool_count: Optional[pulumi.Input[int]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'VpcIpamScope':
        """
        Get an existing VpcIpamScope resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the scope.
        :param pulumi.Input[str] description: A description for the scope you're creating.
        :param pulumi.Input[str] ipam_arn: The ARN of the IPAM for which you're creating this scope.
        :param pulumi.Input[str] ipam_id: The ID of the IPAM for which you're creating this scope.
        :param pulumi.Input[bool] is_default: Defines if the scope is the default scope or not.
        :param pulumi.Input[int] pool_count: The number of pools in the scope.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcIpamScopeState.__new__(_VpcIpamScopeState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["ipam_arn"] = ipam_arn
        __props__.__dict__["ipam_id"] = ipam_id
        __props__.__dict__["ipam_scope_type"] = ipam_scope_type
        __props__.__dict__["is_default"] = is_default
        __props__.__dict__["pool_count"] = pool_count
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return VpcIpamScope(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the scope.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description for the scope you're creating.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="ipamArn")
    def ipam_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the IPAM for which you're creating this scope.
        """
        return pulumi.get(self, "ipam_arn")

    @property
    @pulumi.getter(name="ipamId")
    def ipam_id(self) -> pulumi.Output[str]:
        """
        The ID of the IPAM for which you're creating this scope.
        """
        return pulumi.get(self, "ipam_id")

    @property
    @pulumi.getter(name="ipamScopeType")
    def ipam_scope_type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ipam_scope_type")

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> pulumi.Output[bool]:
        """
        Defines if the scope is the default scope or not.
        """
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter(name="poolCount")
    def pool_count(self) -> pulumi.Output[int]:
        """
        The number of pools in the scope.
        """
        return pulumi.get(self, "pool_count")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")

