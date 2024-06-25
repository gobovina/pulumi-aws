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

__all__ = ['CacheArgs', 'Cache']

@pulumi.input_type
class CacheArgs:
    def __init__(__self__, *,
                 disk_id: pulumi.Input[str],
                 gateway_arn: pulumi.Input[str]):
        """
        The set of arguments for constructing a Cache resource.
        :param pulumi.Input[str] disk_id: Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
        :param pulumi.Input[str] gateway_arn: The Amazon Resource Name (ARN) of the gateway.
        """
        pulumi.set(__self__, "disk_id", disk_id)
        pulumi.set(__self__, "gateway_arn", gateway_arn)

    @property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> pulumi.Input[str]:
        """
        Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
        """
        return pulumi.get(self, "disk_id")

    @disk_id.setter
    def disk_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "disk_id", value)

    @property
    @pulumi.getter(name="gatewayArn")
    def gateway_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the gateway.
        """
        return pulumi.get(self, "gateway_arn")

    @gateway_arn.setter
    def gateway_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "gateway_arn", value)


@pulumi.input_type
class _CacheState:
    def __init__(__self__, *,
                 disk_id: Optional[pulumi.Input[str]] = None,
                 gateway_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Cache resources.
        :param pulumi.Input[str] disk_id: Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
        :param pulumi.Input[str] gateway_arn: The Amazon Resource Name (ARN) of the gateway.
        """
        if disk_id is not None:
            pulumi.set(__self__, "disk_id", disk_id)
        if gateway_arn is not None:
            pulumi.set(__self__, "gateway_arn", gateway_arn)

    @property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> Optional[pulumi.Input[str]]:
        """
        Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
        """
        return pulumi.get(self, "disk_id")

    @disk_id.setter
    def disk_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "disk_id", value)

    @property
    @pulumi.getter(name="gatewayArn")
    def gateway_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the gateway.
        """
        return pulumi.get(self, "gateway_arn")

    @gateway_arn.setter
    def gateway_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway_arn", value)


class Cache(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disk_id: Optional[pulumi.Input[str]] = None,
                 gateway_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an AWS Storage Gateway cache.

        > **NOTE:** The Storage Gateway API provides no method to remove a cache disk. Destroying this resource does not perform any Storage Gateway actions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.storagegateway.Cache("example",
            disk_id=example_aws_storagegateway_local_disk["id"],
            gateway_arn=example_aws_storagegateway_gateway["arn"])
        ```

        ## Import

        Using `pulumi import`, import `aws_storagegateway_cache` using the gateway Amazon Resource Name (ARN) and local disk identifier separated with a colon (`:`). For example:

        ```sh
        $ pulumi import aws:storagegateway/cache:Cache example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678:pci-0000:03:00.0-scsi-0:0:0:0
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] disk_id: Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
        :param pulumi.Input[str] gateway_arn: The Amazon Resource Name (ARN) of the gateway.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CacheArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an AWS Storage Gateway cache.

        > **NOTE:** The Storage Gateway API provides no method to remove a cache disk. Destroying this resource does not perform any Storage Gateway actions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.storagegateway.Cache("example",
            disk_id=example_aws_storagegateway_local_disk["id"],
            gateway_arn=example_aws_storagegateway_gateway["arn"])
        ```

        ## Import

        Using `pulumi import`, import `aws_storagegateway_cache` using the gateway Amazon Resource Name (ARN) and local disk identifier separated with a colon (`:`). For example:

        ```sh
        $ pulumi import aws:storagegateway/cache:Cache example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678:pci-0000:03:00.0-scsi-0:0:0:0
        ```

        :param str resource_name: The name of the resource.
        :param CacheArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CacheArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disk_id: Optional[pulumi.Input[str]] = None,
                 gateway_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CacheArgs.__new__(CacheArgs)

            if disk_id is None and not opts.urn:
                raise TypeError("Missing required property 'disk_id'")
            __props__.__dict__["disk_id"] = disk_id
            if gateway_arn is None and not opts.urn:
                raise TypeError("Missing required property 'gateway_arn'")
            __props__.__dict__["gateway_arn"] = gateway_arn
        super(Cache, __self__).__init__(
            'aws:storagegateway/cache:Cache',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            disk_id: Optional[pulumi.Input[str]] = None,
            gateway_arn: Optional[pulumi.Input[str]] = None) -> 'Cache':
        """
        Get an existing Cache resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] disk_id: Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
        :param pulumi.Input[str] gateway_arn: The Amazon Resource Name (ARN) of the gateway.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CacheState.__new__(_CacheState)

        __props__.__dict__["disk_id"] = disk_id
        __props__.__dict__["gateway_arn"] = gateway_arn
        return Cache(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> pulumi.Output[str]:
        """
        Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
        """
        return pulumi.get(self, "disk_id")

    @property
    @pulumi.getter(name="gatewayArn")
    def gateway_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the gateway.
        """
        return pulumi.get(self, "gateway_arn")

