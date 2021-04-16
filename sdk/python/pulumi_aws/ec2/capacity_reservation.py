# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from ._enums import *

__all__ = ['CapacityReservationArgs', 'CapacityReservation']

@pulumi.input_type
class CapacityReservationArgs:
    def __init__(__self__, *,
                 availability_zone: pulumi.Input[str],
                 instance_count: pulumi.Input[int],
                 instance_platform: pulumi.Input[Union[str, 'InstancePlatform']],
                 instance_type: pulumi.Input[Union[str, 'InstanceType']],
                 ebs_optimized: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 end_date_type: Optional[pulumi.Input[str]] = None,
                 ephemeral_storage: Optional[pulumi.Input[bool]] = None,
                 instance_match_criteria: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tenancy: Optional[pulumi.Input[Union[str, 'Tenancy']]] = None):
        """
        The set of arguments for constructing a CapacityReservation resource.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create the Capacity Reservation.
        :param pulumi.Input[int] instance_count: The number of instances for which to reserve capacity.
        :param pulumi.Input[Union[str, 'InstancePlatform']] instance_platform: The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        :param pulumi.Input[Union[str, 'InstanceType']] instance_type: The instance type for which to reserve capacity.
        :param pulumi.Input[bool] ebs_optimized: Indicates whether the Capacity Reservation supports EBS-optimized instances.
        :param pulumi.Input[str] end_date: The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        :param pulumi.Input[str] end_date_type: Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
        :param pulumi.Input[bool] ephemeral_storage: Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
        :param pulumi.Input[str] instance_match_criteria: Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        :param pulumi.Input[Union[str, 'Tenancy']] tenancy: Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
        """
        pulumi.set(__self__, "availability_zone", availability_zone)
        pulumi.set(__self__, "instance_count", instance_count)
        pulumi.set(__self__, "instance_platform", instance_platform)
        pulumi.set(__self__, "instance_type", instance_type)
        if ebs_optimized is not None:
            pulumi.set(__self__, "ebs_optimized", ebs_optimized)
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if end_date_type is not None:
            pulumi.set(__self__, "end_date_type", end_date_type)
        if ephemeral_storage is not None:
            pulumi.set(__self__, "ephemeral_storage", ephemeral_storage)
        if instance_match_criteria is not None:
            pulumi.set(__self__, "instance_match_criteria", instance_match_criteria)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tenancy is not None:
            pulumi.set(__self__, "tenancy", tenancy)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> pulumi.Input[str]:
        """
        The Availability Zone in which to create the Capacity Reservation.
        """
        return pulumi.get(self, "availability_zone")

    @availability_zone.setter
    def availability_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "availability_zone", value)

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> pulumi.Input[int]:
        """
        The number of instances for which to reserve capacity.
        """
        return pulumi.get(self, "instance_count")

    @instance_count.setter
    def instance_count(self, value: pulumi.Input[int]):
        pulumi.set(self, "instance_count", value)

    @property
    @pulumi.getter(name="instancePlatform")
    def instance_platform(self) -> pulumi.Input[Union[str, 'InstancePlatform']]:
        """
        The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        """
        return pulumi.get(self, "instance_platform")

    @instance_platform.setter
    def instance_platform(self, value: pulumi.Input[Union[str, 'InstancePlatform']]):
        pulumi.set(self, "instance_platform", value)

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Input[Union[str, 'InstanceType']]:
        """
        The instance type for which to reserve capacity.
        """
        return pulumi.get(self, "instance_type")

    @instance_type.setter
    def instance_type(self, value: pulumi.Input[Union[str, 'InstanceType']]):
        pulumi.set(self, "instance_type", value)

    @property
    @pulumi.getter(name="ebsOptimized")
    def ebs_optimized(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the Capacity Reservation supports EBS-optimized instances.
        """
        return pulumi.get(self, "ebs_optimized")

    @ebs_optimized.setter
    def ebs_optimized(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ebs_optimized", value)

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date", value)

    @property
    @pulumi.getter(name="endDateType")
    def end_date_type(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
        """
        return pulumi.get(self, "end_date_type")

    @end_date_type.setter
    def end_date_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date_type", value)

    @property
    @pulumi.getter(name="ephemeralStorage")
    def ephemeral_storage(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
        """
        return pulumi.get(self, "ephemeral_storage")

    @ephemeral_storage.setter
    def ephemeral_storage(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ephemeral_storage", value)

    @property
    @pulumi.getter(name="instanceMatchCriteria")
    def instance_match_criteria(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
        """
        return pulumi.get(self, "instance_match_criteria")

    @instance_match_criteria.setter
    def instance_match_criteria(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_match_criteria", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def tenancy(self) -> Optional[pulumi.Input[Union[str, 'Tenancy']]]:
        """
        Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
        """
        return pulumi.get(self, "tenancy")

    @tenancy.setter
    def tenancy(self, value: Optional[pulumi.Input[Union[str, 'Tenancy']]]):
        pulumi.set(self, "tenancy", value)


@pulumi.input_type
class _CapacityReservationState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 ebs_optimized: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 end_date_type: Optional[pulumi.Input[str]] = None,
                 ephemeral_storage: Optional[pulumi.Input[bool]] = None,
                 instance_count: Optional[pulumi.Input[int]] = None,
                 instance_match_criteria: Optional[pulumi.Input[str]] = None,
                 instance_platform: Optional[pulumi.Input[Union[str, 'InstancePlatform']]] = None,
                 instance_type: Optional[pulumi.Input[Union[str, 'InstanceType']]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tenancy: Optional[pulumi.Input[Union[str, 'Tenancy']]] = None):
        """
        Input properties used for looking up and filtering CapacityReservation resources.
        :param pulumi.Input[str] arn: The ARN of the Capacity Reservation.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create the Capacity Reservation.
        :param pulumi.Input[bool] ebs_optimized: Indicates whether the Capacity Reservation supports EBS-optimized instances.
        :param pulumi.Input[str] end_date: The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        :param pulumi.Input[str] end_date_type: Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
        :param pulumi.Input[bool] ephemeral_storage: Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
        :param pulumi.Input[int] instance_count: The number of instances for which to reserve capacity.
        :param pulumi.Input[str] instance_match_criteria: Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
        :param pulumi.Input[Union[str, 'InstancePlatform']] instance_platform: The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        :param pulumi.Input[Union[str, 'InstanceType']] instance_type: The instance type for which to reserve capacity.
        :param pulumi.Input[str] owner_id: The ID of the AWS account that owns the Capacity Reservation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        :param pulumi.Input[Union[str, 'Tenancy']] tenancy: Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if availability_zone is not None:
            pulumi.set(__self__, "availability_zone", availability_zone)
        if ebs_optimized is not None:
            pulumi.set(__self__, "ebs_optimized", ebs_optimized)
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if end_date_type is not None:
            pulumi.set(__self__, "end_date_type", end_date_type)
        if ephemeral_storage is not None:
            pulumi.set(__self__, "ephemeral_storage", ephemeral_storage)
        if instance_count is not None:
            pulumi.set(__self__, "instance_count", instance_count)
        if instance_match_criteria is not None:
            pulumi.set(__self__, "instance_match_criteria", instance_match_criteria)
        if instance_platform is not None:
            pulumi.set(__self__, "instance_platform", instance_platform)
        if instance_type is not None:
            pulumi.set(__self__, "instance_type", instance_type)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tenancy is not None:
            pulumi.set(__self__, "tenancy", tenancy)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Capacity Reservation.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The Availability Zone in which to create the Capacity Reservation.
        """
        return pulumi.get(self, "availability_zone")

    @availability_zone.setter
    def availability_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "availability_zone", value)

    @property
    @pulumi.getter(name="ebsOptimized")
    def ebs_optimized(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the Capacity Reservation supports EBS-optimized instances.
        """
        return pulumi.get(self, "ebs_optimized")

    @ebs_optimized.setter
    def ebs_optimized(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ebs_optimized", value)

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date", value)

    @property
    @pulumi.getter(name="endDateType")
    def end_date_type(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
        """
        return pulumi.get(self, "end_date_type")

    @end_date_type.setter
    def end_date_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date_type", value)

    @property
    @pulumi.getter(name="ephemeralStorage")
    def ephemeral_storage(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
        """
        return pulumi.get(self, "ephemeral_storage")

    @ephemeral_storage.setter
    def ephemeral_storage(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ephemeral_storage", value)

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of instances for which to reserve capacity.
        """
        return pulumi.get(self, "instance_count")

    @instance_count.setter
    def instance_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "instance_count", value)

    @property
    @pulumi.getter(name="instanceMatchCriteria")
    def instance_match_criteria(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
        """
        return pulumi.get(self, "instance_match_criteria")

    @instance_match_criteria.setter
    def instance_match_criteria(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_match_criteria", value)

    @property
    @pulumi.getter(name="instancePlatform")
    def instance_platform(self) -> Optional[pulumi.Input[Union[str, 'InstancePlatform']]]:
        """
        The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        """
        return pulumi.get(self, "instance_platform")

    @instance_platform.setter
    def instance_platform(self, value: Optional[pulumi.Input[Union[str, 'InstancePlatform']]]):
        pulumi.set(self, "instance_platform", value)

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> Optional[pulumi.Input[Union[str, 'InstanceType']]]:
        """
        The instance type for which to reserve capacity.
        """
        return pulumi.get(self, "instance_type")

    @instance_type.setter
    def instance_type(self, value: Optional[pulumi.Input[Union[str, 'InstanceType']]]):
        pulumi.set(self, "instance_type", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the AWS account that owns the Capacity Reservation.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def tenancy(self) -> Optional[pulumi.Input[Union[str, 'Tenancy']]]:
        """
        Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
        """
        return pulumi.get(self, "tenancy")

    @tenancy.setter
    def tenancy(self, value: Optional[pulumi.Input[Union[str, 'Tenancy']]]):
        pulumi.set(self, "tenancy", value)


class CapacityReservation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 ebs_optimized: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 end_date_type: Optional[pulumi.Input[str]] = None,
                 ephemeral_storage: Optional[pulumi.Input[bool]] = None,
                 instance_count: Optional[pulumi.Input[int]] = None,
                 instance_match_criteria: Optional[pulumi.Input[str]] = None,
                 instance_platform: Optional[pulumi.Input[Union[str, 'InstancePlatform']]] = None,
                 instance_type: Optional[pulumi.Input[Union[str, 'InstanceType']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tenancy: Optional[pulumi.Input[Union[str, 'Tenancy']]] = None,
                 __props__=None):
        """
        Provides an EC2 Capacity Reservation. This allows you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.ec2.CapacityReservation("default",
            availability_zone="eu-west-1a",
            instance_count=1,
            instance_platform="Linux/UNIX",
            instance_type="t2.micro")
        ```

        ## Import

        Capacity Reservations can be imported using the `id`, e.g.

        ```sh
         $ pulumi import aws:ec2/capacityReservation:CapacityReservation web cr-0123456789abcdef0
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create the Capacity Reservation.
        :param pulumi.Input[bool] ebs_optimized: Indicates whether the Capacity Reservation supports EBS-optimized instances.
        :param pulumi.Input[str] end_date: The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        :param pulumi.Input[str] end_date_type: Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
        :param pulumi.Input[bool] ephemeral_storage: Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
        :param pulumi.Input[int] instance_count: The number of instances for which to reserve capacity.
        :param pulumi.Input[str] instance_match_criteria: Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
        :param pulumi.Input[Union[str, 'InstancePlatform']] instance_platform: The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        :param pulumi.Input[Union[str, 'InstanceType']] instance_type: The instance type for which to reserve capacity.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        :param pulumi.Input[Union[str, 'Tenancy']] tenancy: Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CapacityReservationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an EC2 Capacity Reservation. This allows you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.ec2.CapacityReservation("default",
            availability_zone="eu-west-1a",
            instance_count=1,
            instance_platform="Linux/UNIX",
            instance_type="t2.micro")
        ```

        ## Import

        Capacity Reservations can be imported using the `id`, e.g.

        ```sh
         $ pulumi import aws:ec2/capacityReservation:CapacityReservation web cr-0123456789abcdef0
        ```

        :param str resource_name: The name of the resource.
        :param CapacityReservationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CapacityReservationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 ebs_optimized: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 end_date_type: Optional[pulumi.Input[str]] = None,
                 ephemeral_storage: Optional[pulumi.Input[bool]] = None,
                 instance_count: Optional[pulumi.Input[int]] = None,
                 instance_match_criteria: Optional[pulumi.Input[str]] = None,
                 instance_platform: Optional[pulumi.Input[Union[str, 'InstancePlatform']]] = None,
                 instance_type: Optional[pulumi.Input[Union[str, 'InstanceType']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tenancy: Optional[pulumi.Input[Union[str, 'Tenancy']]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CapacityReservationArgs.__new__(CapacityReservationArgs)

            if availability_zone is None and not opts.urn:
                raise TypeError("Missing required property 'availability_zone'")
            __props__.__dict__["availability_zone"] = availability_zone
            __props__.__dict__["ebs_optimized"] = ebs_optimized
            __props__.__dict__["end_date"] = end_date
            __props__.__dict__["end_date_type"] = end_date_type
            __props__.__dict__["ephemeral_storage"] = ephemeral_storage
            if instance_count is None and not opts.urn:
                raise TypeError("Missing required property 'instance_count'")
            __props__.__dict__["instance_count"] = instance_count
            __props__.__dict__["instance_match_criteria"] = instance_match_criteria
            if instance_platform is None and not opts.urn:
                raise TypeError("Missing required property 'instance_platform'")
            __props__.__dict__["instance_platform"] = instance_platform
            if instance_type is None and not opts.urn:
                raise TypeError("Missing required property 'instance_type'")
            __props__.__dict__["instance_type"] = instance_type
            __props__.__dict__["tags"] = tags
            __props__.__dict__["tenancy"] = tenancy
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner_id"] = None
        super(CapacityReservation, __self__).__init__(
            'aws:ec2/capacityReservation:CapacityReservation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            availability_zone: Optional[pulumi.Input[str]] = None,
            ebs_optimized: Optional[pulumi.Input[bool]] = None,
            end_date: Optional[pulumi.Input[str]] = None,
            end_date_type: Optional[pulumi.Input[str]] = None,
            ephemeral_storage: Optional[pulumi.Input[bool]] = None,
            instance_count: Optional[pulumi.Input[int]] = None,
            instance_match_criteria: Optional[pulumi.Input[str]] = None,
            instance_platform: Optional[pulumi.Input[Union[str, 'InstancePlatform']]] = None,
            instance_type: Optional[pulumi.Input[Union[str, 'InstanceType']]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tenancy: Optional[pulumi.Input[Union[str, 'Tenancy']]] = None) -> 'CapacityReservation':
        """
        Get an existing CapacityReservation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the Capacity Reservation.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create the Capacity Reservation.
        :param pulumi.Input[bool] ebs_optimized: Indicates whether the Capacity Reservation supports EBS-optimized instances.
        :param pulumi.Input[str] end_date: The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        :param pulumi.Input[str] end_date_type: Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
        :param pulumi.Input[bool] ephemeral_storage: Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
        :param pulumi.Input[int] instance_count: The number of instances for which to reserve capacity.
        :param pulumi.Input[str] instance_match_criteria: Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
        :param pulumi.Input[Union[str, 'InstancePlatform']] instance_platform: The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        :param pulumi.Input[Union[str, 'InstanceType']] instance_type: The instance type for which to reserve capacity.
        :param pulumi.Input[str] owner_id: The ID of the AWS account that owns the Capacity Reservation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource.
        :param pulumi.Input[Union[str, 'Tenancy']] tenancy: Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CapacityReservationState.__new__(_CapacityReservationState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["availability_zone"] = availability_zone
        __props__.__dict__["ebs_optimized"] = ebs_optimized
        __props__.__dict__["end_date"] = end_date
        __props__.__dict__["end_date_type"] = end_date_type
        __props__.__dict__["ephemeral_storage"] = ephemeral_storage
        __props__.__dict__["instance_count"] = instance_count
        __props__.__dict__["instance_match_criteria"] = instance_match_criteria
        __props__.__dict__["instance_platform"] = instance_platform
        __props__.__dict__["instance_type"] = instance_type
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tenancy"] = tenancy
        return CapacityReservation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Capacity Reservation.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> pulumi.Output[str]:
        """
        The Availability Zone in which to create the Capacity Reservation.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter(name="ebsOptimized")
    def ebs_optimized(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the Capacity Reservation supports EBS-optimized instances.
        """
        return pulumi.get(self, "ebs_optimized")

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> pulumi.Output[Optional[str]]:
        """
        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        """
        return pulumi.get(self, "end_date")

    @property
    @pulumi.getter(name="endDateType")
    def end_date_type(self) -> pulumi.Output[Optional[str]]:
        """
        Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
        """
        return pulumi.get(self, "end_date_type")

    @property
    @pulumi.getter(name="ephemeralStorage")
    def ephemeral_storage(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
        """
        return pulumi.get(self, "ephemeral_storage")

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> pulumi.Output[int]:
        """
        The number of instances for which to reserve capacity.
        """
        return pulumi.get(self, "instance_count")

    @property
    @pulumi.getter(name="instanceMatchCriteria")
    def instance_match_criteria(self) -> pulumi.Output[Optional[str]]:
        """
        Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
        """
        return pulumi.get(self, "instance_match_criteria")

    @property
    @pulumi.getter(name="instancePlatform")
    def instance_platform(self) -> pulumi.Output[str]:
        """
        The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        """
        return pulumi.get(self, "instance_platform")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Output[str]:
        """
        The instance type for which to reserve capacity.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        The ID of the AWS account that owns the Capacity Reservation.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def tenancy(self) -> pulumi.Output[Optional[str]]:
        """
        Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
        """
        return pulumi.get(self, "tenancy")

