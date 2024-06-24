# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DiskArgs', 'Disk']

@pulumi.input_type
class DiskArgs:
    def __init__(__self__, *,
                 availability_zone: pulumi.Input[str],
                 size_in_gb: pulumi.Input[int],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Disk resource.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create your disk.
        :param pulumi.Input[int] size_in_gb: The instance port the load balancer will connect.
        :param pulumi.Input[str] name: The name of the Lightsail load balancer.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "availability_zone", availability_zone)
        pulumi.set(__self__, "size_in_gb", size_in_gb)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> pulumi.Input[str]:
        """
        The Availability Zone in which to create your disk.
        """
        return pulumi.get(self, "availability_zone")

    @availability_zone.setter
    def availability_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "availability_zone", value)

    @property
    @pulumi.getter(name="sizeInGb")
    def size_in_gb(self) -> pulumi.Input[int]:
        """
        The instance port the load balancer will connect.
        """
        return pulumi.get(self, "size_in_gb")

    @size_in_gb.setter
    def size_in_gb(self, value: pulumi.Input[int]):
        pulumi.set(self, "size_in_gb", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DiskState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 size_in_gb: Optional[pulumi.Input[int]] = None,
                 support_code: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Disk resources.
        :param pulumi.Input[str] arn: The ARN of the Lightsail load balancer.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create your disk.
        :param pulumi.Input[str] created_at: The timestamp when the load balancer was created.
        :param pulumi.Input[str] name: The name of the Lightsail load balancer.
        :param pulumi.Input[int] size_in_gb: The instance port the load balancer will connect.
        :param pulumi.Input[str] support_code: The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if availability_zone is not None:
            pulumi.set(__self__, "availability_zone", availability_zone)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if size_in_gb is not None:
            pulumi.set(__self__, "size_in_gb", size_in_gb)
        if support_code is not None:
            pulumi.set(__self__, "support_code", support_code)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Lightsail load balancer.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The Availability Zone in which to create your disk.
        """
        return pulumi.get(self, "availability_zone")

    @availability_zone.setter
    def availability_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "availability_zone", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp when the load balancer was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sizeInGb")
    def size_in_gb(self) -> Optional[pulumi.Input[int]]:
        """
        The instance port the load balancer will connect.
        """
        return pulumi.get(self, "size_in_gb")

    @size_in_gb.setter
    def size_in_gb(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size_in_gb", value)

    @property
    @pulumi.getter(name="supportCode")
    def support_code(self) -> Optional[pulumi.Input[str]]:
        """
        The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
        """
        return pulumi.get(self, "support_code")

    @support_code.setter
    def support_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_code", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Disk(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 size_in_gb: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Lightsail Disk resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones(state="available",
            filters=[aws.GetAvailabilityZonesFilterArgs(
                name="opt-in-status",
                values=["opt-in-not-required"],
            )])
        test = aws.lightsail.Disk("test",
            name="test",
            size_in_gb=8,
            availability_zone=available.names[0])
        ```

        ## Import

        Using `pulumi import`, import `aws_lightsail_disk` using the name attribute. For example:

        ```sh
        $ pulumi import aws:lightsail/disk:Disk test test
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create your disk.
        :param pulumi.Input[str] name: The name of the Lightsail load balancer.
        :param pulumi.Input[int] size_in_gb: The instance port the load balancer will connect.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DiskArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Lightsail Disk resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        available = aws.get_availability_zones(state="available",
            filters=[aws.GetAvailabilityZonesFilterArgs(
                name="opt-in-status",
                values=["opt-in-not-required"],
            )])
        test = aws.lightsail.Disk("test",
            name="test",
            size_in_gb=8,
            availability_zone=available.names[0])
        ```

        ## Import

        Using `pulumi import`, import `aws_lightsail_disk` using the name attribute. For example:

        ```sh
        $ pulumi import aws:lightsail/disk:Disk test test
        ```

        :param str resource_name: The name of the resource.
        :param DiskArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DiskArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 size_in_gb: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DiskArgs.__new__(DiskArgs)

            if availability_zone is None and not opts.urn:
                raise TypeError("Missing required property 'availability_zone'")
            __props__.__dict__["availability_zone"] = availability_zone
            __props__.__dict__["name"] = name
            if size_in_gb is None and not opts.urn:
                raise TypeError("Missing required property 'size_in_gb'")
            __props__.__dict__["size_in_gb"] = size_in_gb
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["support_code"] = None
            __props__.__dict__["tags_all"] = None
        super(Disk, __self__).__init__(
            'aws:lightsail/disk:Disk',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            availability_zone: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            size_in_gb: Optional[pulumi.Input[int]] = None,
            support_code: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Disk':
        """
        Get an existing Disk resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the Lightsail load balancer.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create your disk.
        :param pulumi.Input[str] created_at: The timestamp when the load balancer was created.
        :param pulumi.Input[str] name: The name of the Lightsail load balancer.
        :param pulumi.Input[int] size_in_gb: The instance port the load balancer will connect.
        :param pulumi.Input[str] support_code: The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DiskState.__new__(_DiskState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["availability_zone"] = availability_zone
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["name"] = name
        __props__.__dict__["size_in_gb"] = size_in_gb
        __props__.__dict__["support_code"] = support_code
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Disk(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Lightsail load balancer.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> pulumi.Output[str]:
        """
        The Availability Zone in which to create your disk.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The timestamp when the load balancer was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Lightsail load balancer.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="sizeInGb")
    def size_in_gb(self) -> pulumi.Output[int]:
        """
        The instance port the load balancer will connect.
        """
        return pulumi.get(self, "size_in_gb")

    @property
    @pulumi.getter(name="supportCode")
    def support_code(self) -> pulumi.Output[str]:
        """
        The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
        """
        return pulumi.get(self, "support_code")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

