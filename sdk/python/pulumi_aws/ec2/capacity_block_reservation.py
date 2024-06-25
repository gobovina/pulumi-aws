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
from . import outputs
from ._inputs import *

__all__ = ['CapacityBlockReservationArgs', 'CapacityBlockReservation']

@pulumi.input_type
class CapacityBlockReservationArgs:
    def __init__(__self__, *,
                 capacity_block_offering_id: pulumi.Input[str],
                 instance_platform: pulumi.Input[str],
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input['CapacityBlockReservationTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a CapacityBlockReservation resource.
        :param pulumi.Input[str] capacity_block_offering_id: The Capacity Block Reservation ID.
        :param pulumi.Input[str] instance_platform: The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "capacity_block_offering_id", capacity_block_offering_id)
        pulumi.set(__self__, "instance_platform", instance_platform)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="capacityBlockOfferingId")
    def capacity_block_offering_id(self) -> pulumi.Input[str]:
        """
        The Capacity Block Reservation ID.
        """
        return pulumi.get(self, "capacity_block_offering_id")

    @capacity_block_offering_id.setter
    def capacity_block_offering_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "capacity_block_offering_id", value)

    @property
    @pulumi.getter(name="instancePlatform")
    def instance_platform(self) -> pulumi.Input[str]:
        """
        The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        """
        return pulumi.get(self, "instance_platform")

    @instance_platform.setter
    def instance_platform(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_platform", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['CapacityBlockReservationTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['CapacityBlockReservationTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _CapacityBlockReservationState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 capacity_block_offering_id: Optional[pulumi.Input[str]] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 ebs_optimized: Optional[pulumi.Input[bool]] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 end_date_type: Optional[pulumi.Input[str]] = None,
                 instance_count: Optional[pulumi.Input[int]] = None,
                 instance_platform: Optional[pulumi.Input[str]] = None,
                 instance_type: Optional[pulumi.Input[str]] = None,
                 outpost_arn: Optional[pulumi.Input[str]] = None,
                 placement_group_arn: Optional[pulumi.Input[str]] = None,
                 reservation_type: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tenancy: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input['CapacityBlockReservationTimeoutsArgs']] = None):
        """
        Input properties used for looking up and filtering CapacityBlockReservation resources.
        :param pulumi.Input[str] arn: The ARN of the reservation.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create the Capacity Block Reservation.
        :param pulumi.Input[str] capacity_block_offering_id: The Capacity Block Reservation ID.
        :param pulumi.Input[str] created_date: The date and time at which the Capacity Block Reservation was created.
        :param pulumi.Input[bool] ebs_optimized: Indicates whether the Capacity Reservation supports EBS-optimized instances.
        :param pulumi.Input[str] end_date: The date and time at which the Capacity Block Reservation expires. When a Capacity Block Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        :param pulumi.Input[str] end_date_type: Indicates the way in which the Capacity Reservation ends.
        :param pulumi.Input[int] instance_count: The number of instances for which to reserve capacity.
        :param pulumi.Input[str] instance_platform: The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        :param pulumi.Input[str] instance_type: The instance type for which to reserve capacity.
        :param pulumi.Input[str] outpost_arn: The ARN of the Outpost on which to create the Capacity Block Reservation.
        :param pulumi.Input[str] placement_group_arn: The ARN of the placement group in which to create the Capacity Block Reservation.
        :param pulumi.Input[str] reservation_type: The type of Capacity Reservation.
        :param pulumi.Input[str] start_date: The date and time at which the Capacity Block Reservation starts. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block
        :param pulumi.Input[str] tenancy: Indicates the tenancy of the Capacity Block Reservation. Specify either `default` or `dedicated`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if availability_zone is not None:
            pulumi.set(__self__, "availability_zone", availability_zone)
        if capacity_block_offering_id is not None:
            pulumi.set(__self__, "capacity_block_offering_id", capacity_block_offering_id)
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if ebs_optimized is not None:
            pulumi.set(__self__, "ebs_optimized", ebs_optimized)
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if end_date_type is not None:
            pulumi.set(__self__, "end_date_type", end_date_type)
        if instance_count is not None:
            pulumi.set(__self__, "instance_count", instance_count)
        if instance_platform is not None:
            pulumi.set(__self__, "instance_platform", instance_platform)
        if instance_type is not None:
            pulumi.set(__self__, "instance_type", instance_type)
        if outpost_arn is not None:
            pulumi.set(__self__, "outpost_arn", outpost_arn)
        if placement_group_arn is not None:
            pulumi.set(__self__, "placement_group_arn", placement_group_arn)
        if reservation_type is not None:
            pulumi.set(__self__, "reservation_type", reservation_type)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if tenancy is not None:
            pulumi.set(__self__, "tenancy", tenancy)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the reservation.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The Availability Zone in which to create the Capacity Block Reservation.
        """
        return pulumi.get(self, "availability_zone")

    @availability_zone.setter
    def availability_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "availability_zone", value)

    @property
    @pulumi.getter(name="capacityBlockOfferingId")
    def capacity_block_offering_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Capacity Block Reservation ID.
        """
        return pulumi.get(self, "capacity_block_offering_id")

    @capacity_block_offering_id.setter
    def capacity_block_offering_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "capacity_block_offering_id", value)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time at which the Capacity Block Reservation was created.
        """
        return pulumi.get(self, "created_date")

    @created_date.setter
    def created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_date", value)

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
        The date and time at which the Capacity Block Reservation expires. When a Capacity Block Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date", value)

    @property
    @pulumi.getter(name="endDateType")
    def end_date_type(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates the way in which the Capacity Reservation ends.
        """
        return pulumi.get(self, "end_date_type")

    @end_date_type.setter
    def end_date_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date_type", value)

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
    @pulumi.getter(name="instancePlatform")
    def instance_platform(self) -> Optional[pulumi.Input[str]]:
        """
        The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        """
        return pulumi.get(self, "instance_platform")

    @instance_platform.setter
    def instance_platform(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_platform", value)

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> Optional[pulumi.Input[str]]:
        """
        The instance type for which to reserve capacity.
        """
        return pulumi.get(self, "instance_type")

    @instance_type.setter
    def instance_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_type", value)

    @property
    @pulumi.getter(name="outpostArn")
    def outpost_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Outpost on which to create the Capacity Block Reservation.
        """
        return pulumi.get(self, "outpost_arn")

    @outpost_arn.setter
    def outpost_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "outpost_arn", value)

    @property
    @pulumi.getter(name="placementGroupArn")
    def placement_group_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the placement group in which to create the Capacity Block Reservation.
        """
        return pulumi.get(self, "placement_group_arn")

    @placement_group_arn.setter
    def placement_group_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "placement_group_arn", value)

    @property
    @pulumi.getter(name="reservationType")
    def reservation_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of Capacity Reservation.
        """
        return pulumi.get(self, "reservation_type")

    @reservation_type.setter
    def reservation_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reservation_type", value)

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time at which the Capacity Block Reservation starts. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def tenancy(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates the tenancy of the Capacity Block Reservation. Specify either `default` or `dedicated`.
        """
        return pulumi.get(self, "tenancy")

    @tenancy.setter
    def tenancy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenancy", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['CapacityBlockReservationTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['CapacityBlockReservationTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


class CapacityBlockReservation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 capacity_block_offering_id: Optional[pulumi.Input[str]] = None,
                 instance_platform: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input[Union['CapacityBlockReservationTimeoutsArgs', 'CapacityBlockReservationTimeoutsArgsDict']]] = None,
                 __props__=None):
        """
        Provides an EC2 Capacity Block Reservation. This allows you to purchase capacity block for your Amazon EC2 instances in a specific Availability Zone for machine learning (ML) Workloads.

        > **NOTE:** Once created, a reservation is valid for the `duration` of the provided `capacity_block_offering_id` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [EC2 Capacity Block Reservation Documentation](https://aws.amazon.com/ec2/instance-types/p5/) and [PurchaseReservedDBInstancesOffering](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-blocks-pricing-billing.html).

        > **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] capacity_block_offering_id: The Capacity Block Reservation ID.
        :param pulumi.Input[str] instance_platform: The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CapacityBlockReservationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an EC2 Capacity Block Reservation. This allows you to purchase capacity block for your Amazon EC2 instances in a specific Availability Zone for machine learning (ML) Workloads.

        > **NOTE:** Once created, a reservation is valid for the `duration` of the provided `capacity_block_offering_id` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [EC2 Capacity Block Reservation Documentation](https://aws.amazon.com/ec2/instance-types/p5/) and [PurchaseReservedDBInstancesOffering](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-blocks-pricing-billing.html).

        > **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.

        :param str resource_name: The name of the resource.
        :param CapacityBlockReservationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CapacityBlockReservationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 capacity_block_offering_id: Optional[pulumi.Input[str]] = None,
                 instance_platform: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input[Union['CapacityBlockReservationTimeoutsArgs', 'CapacityBlockReservationTimeoutsArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CapacityBlockReservationArgs.__new__(CapacityBlockReservationArgs)

            if capacity_block_offering_id is None and not opts.urn:
                raise TypeError("Missing required property 'capacity_block_offering_id'")
            __props__.__dict__["capacity_block_offering_id"] = capacity_block_offering_id
            if instance_platform is None and not opts.urn:
                raise TypeError("Missing required property 'instance_platform'")
            __props__.__dict__["instance_platform"] = instance_platform
            __props__.__dict__["tags"] = tags
            __props__.__dict__["timeouts"] = timeouts
            __props__.__dict__["arn"] = None
            __props__.__dict__["availability_zone"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["ebs_optimized"] = None
            __props__.__dict__["end_date"] = None
            __props__.__dict__["end_date_type"] = None
            __props__.__dict__["instance_count"] = None
            __props__.__dict__["instance_type"] = None
            __props__.__dict__["outpost_arn"] = None
            __props__.__dict__["placement_group_arn"] = None
            __props__.__dict__["reservation_type"] = None
            __props__.__dict__["start_date"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["tenancy"] = None
        super(CapacityBlockReservation, __self__).__init__(
            'aws:ec2/capacityBlockReservation:CapacityBlockReservation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            availability_zone: Optional[pulumi.Input[str]] = None,
            capacity_block_offering_id: Optional[pulumi.Input[str]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            ebs_optimized: Optional[pulumi.Input[bool]] = None,
            end_date: Optional[pulumi.Input[str]] = None,
            end_date_type: Optional[pulumi.Input[str]] = None,
            instance_count: Optional[pulumi.Input[int]] = None,
            instance_platform: Optional[pulumi.Input[str]] = None,
            instance_type: Optional[pulumi.Input[str]] = None,
            outpost_arn: Optional[pulumi.Input[str]] = None,
            placement_group_arn: Optional[pulumi.Input[str]] = None,
            reservation_type: Optional[pulumi.Input[str]] = None,
            start_date: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tenancy: Optional[pulumi.Input[str]] = None,
            timeouts: Optional[pulumi.Input[Union['CapacityBlockReservationTimeoutsArgs', 'CapacityBlockReservationTimeoutsArgsDict']]] = None) -> 'CapacityBlockReservation':
        """
        Get an existing CapacityBlockReservation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the reservation.
        :param pulumi.Input[str] availability_zone: The Availability Zone in which to create the Capacity Block Reservation.
        :param pulumi.Input[str] capacity_block_offering_id: The Capacity Block Reservation ID.
        :param pulumi.Input[str] created_date: The date and time at which the Capacity Block Reservation was created.
        :param pulumi.Input[bool] ebs_optimized: Indicates whether the Capacity Reservation supports EBS-optimized instances.
        :param pulumi.Input[str] end_date: The date and time at which the Capacity Block Reservation expires. When a Capacity Block Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        :param pulumi.Input[str] end_date_type: Indicates the way in which the Capacity Reservation ends.
        :param pulumi.Input[int] instance_count: The number of instances for which to reserve capacity.
        :param pulumi.Input[str] instance_platform: The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
        :param pulumi.Input[str] instance_type: The instance type for which to reserve capacity.
        :param pulumi.Input[str] outpost_arn: The ARN of the Outpost on which to create the Capacity Block Reservation.
        :param pulumi.Input[str] placement_group_arn: The ARN of the placement group in which to create the Capacity Block Reservation.
        :param pulumi.Input[str] reservation_type: The type of Capacity Reservation.
        :param pulumi.Input[str] start_date: The date and time at which the Capacity Block Reservation starts. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block
        :param pulumi.Input[str] tenancy: Indicates the tenancy of the Capacity Block Reservation. Specify either `default` or `dedicated`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CapacityBlockReservationState.__new__(_CapacityBlockReservationState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["availability_zone"] = availability_zone
        __props__.__dict__["capacity_block_offering_id"] = capacity_block_offering_id
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["ebs_optimized"] = ebs_optimized
        __props__.__dict__["end_date"] = end_date
        __props__.__dict__["end_date_type"] = end_date_type
        __props__.__dict__["instance_count"] = instance_count
        __props__.__dict__["instance_platform"] = instance_platform
        __props__.__dict__["instance_type"] = instance_type
        __props__.__dict__["outpost_arn"] = outpost_arn
        __props__.__dict__["placement_group_arn"] = placement_group_arn
        __props__.__dict__["reservation_type"] = reservation_type
        __props__.__dict__["start_date"] = start_date
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["tenancy"] = tenancy
        __props__.__dict__["timeouts"] = timeouts
        return CapacityBlockReservation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the reservation.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> pulumi.Output[str]:
        """
        The Availability Zone in which to create the Capacity Block Reservation.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter(name="capacityBlockOfferingId")
    def capacity_block_offering_id(self) -> pulumi.Output[str]:
        """
        The Capacity Block Reservation ID.
        """
        return pulumi.get(self, "capacity_block_offering_id")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        The date and time at which the Capacity Block Reservation was created.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="ebsOptimized")
    def ebs_optimized(self) -> pulumi.Output[bool]:
        """
        Indicates whether the Capacity Reservation supports EBS-optimized instances.
        """
        return pulumi.get(self, "ebs_optimized")

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> pulumi.Output[str]:
        """
        The date and time at which the Capacity Block Reservation expires. When a Capacity Block Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        """
        return pulumi.get(self, "end_date")

    @property
    @pulumi.getter(name="endDateType")
    def end_date_type(self) -> pulumi.Output[str]:
        """
        Indicates the way in which the Capacity Reservation ends.
        """
        return pulumi.get(self, "end_date_type")

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> pulumi.Output[int]:
        """
        The number of instances for which to reserve capacity.
        """
        return pulumi.get(self, "instance_count")

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
    @pulumi.getter(name="outpostArn")
    def outpost_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Outpost on which to create the Capacity Block Reservation.
        """
        return pulumi.get(self, "outpost_arn")

    @property
    @pulumi.getter(name="placementGroupArn")
    def placement_group_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the placement group in which to create the Capacity Block Reservation.
        """
        return pulumi.get(self, "placement_group_arn")

    @property
    @pulumi.getter(name="reservationType")
    def reservation_type(self) -> pulumi.Output[str]:
        """
        The type of Capacity Reservation.
        """
        return pulumi.get(self, "reservation_type")

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> pulumi.Output[str]:
        """
        The date and time at which the Capacity Block Reservation starts. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        """
        return pulumi.get(self, "start_date")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def tenancy(self) -> pulumi.Output[str]:
        """
        Indicates the tenancy of the Capacity Block Reservation. Specify either `default` or `dedicated`.
        """
        return pulumi.get(self, "tenancy")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.CapacityBlockReservationTimeouts']]:
        return pulumi.get(self, "timeouts")

