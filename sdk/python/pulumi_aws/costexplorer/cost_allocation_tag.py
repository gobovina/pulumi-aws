# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['CostAllocationTagArgs', 'CostAllocationTag']

@pulumi.input_type
class CostAllocationTagArgs:
    def __init__(__self__, *,
                 status: pulumi.Input[str],
                 tag_key: pulumi.Input[str]):
        """
        The set of arguments for constructing a CostAllocationTag resource.
        :param pulumi.Input[str] status: The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
        :param pulumi.Input[str] tag_key: The key for the cost allocation tag.
        """
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "tag_key", tag_key)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[str]:
        """
        The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="tagKey")
    def tag_key(self) -> pulumi.Input[str]:
        """
        The key for the cost allocation tag.
        """
        return pulumi.get(self, "tag_key")

    @tag_key.setter
    def tag_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "tag_key", value)


@pulumi.input_type
class _CostAllocationTagState:
    def __init__(__self__, *,
                 status: Optional[pulumi.Input[str]] = None,
                 tag_key: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CostAllocationTag resources.
        :param pulumi.Input[str] status: The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
        :param pulumi.Input[str] tag_key: The key for the cost allocation tag.
        :param pulumi.Input[str] type: The type of cost allocation tag.
        """
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tag_key is not None:
            pulumi.set(__self__, "tag_key", tag_key)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="tagKey")
    def tag_key(self) -> Optional[pulumi.Input[str]]:
        """
        The key for the cost allocation tag.
        """
        return pulumi.get(self, "tag_key")

    @tag_key.setter
    def tag_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag_key", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of cost allocation tag.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class CostAllocationTag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tag_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CE Cost Allocation Tag.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.costexplorer.CostAllocationTag("example",
            tag_key="example",
            status="Active")
        ```

        ## Import

        Using `pulumi import`, import `aws_ce_cost_allocation_tag` using the `id`. For example:

        ```sh
        $ pulumi import aws:costexplorer/costAllocationTag:CostAllocationTag example key
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] status: The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
        :param pulumi.Input[str] tag_key: The key for the cost allocation tag.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CostAllocationTagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CE Cost Allocation Tag.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.costexplorer.CostAllocationTag("example",
            tag_key="example",
            status="Active")
        ```

        ## Import

        Using `pulumi import`, import `aws_ce_cost_allocation_tag` using the `id`. For example:

        ```sh
        $ pulumi import aws:costexplorer/costAllocationTag:CostAllocationTag example key
        ```

        :param str resource_name: The name of the resource.
        :param CostAllocationTagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CostAllocationTagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tag_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CostAllocationTagArgs.__new__(CostAllocationTagArgs)

            if status is None and not opts.urn:
                raise TypeError("Missing required property 'status'")
            __props__.__dict__["status"] = status
            if tag_key is None and not opts.urn:
                raise TypeError("Missing required property 'tag_key'")
            __props__.__dict__["tag_key"] = tag_key
            __props__.__dict__["type"] = None
        super(CostAllocationTag, __self__).__init__(
            'aws:costexplorer/costAllocationTag:CostAllocationTag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            status: Optional[pulumi.Input[str]] = None,
            tag_key: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'CostAllocationTag':
        """
        Get an existing CostAllocationTag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] status: The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
        :param pulumi.Input[str] tag_key: The key for the cost allocation tag.
        :param pulumi.Input[str] type: The type of cost allocation tag.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CostAllocationTagState.__new__(_CostAllocationTagState)

        __props__.__dict__["status"] = status
        __props__.__dict__["tag_key"] = tag_key
        __props__.__dict__["type"] = type
        return CostAllocationTag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="tagKey")
    def tag_key(self) -> pulumi.Output[str]:
        """
        The key for the cost allocation tag.
        """
        return pulumi.get(self, "tag_key")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of cost allocation tag.
        """
        return pulumi.get(self, "type")

