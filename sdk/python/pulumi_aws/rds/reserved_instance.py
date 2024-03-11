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

__all__ = ['ReservedInstanceArgs', 'ReservedInstance']

@pulumi.input_type
class ReservedInstanceArgs:
    def __init__(__self__, *,
                 offering_id: pulumi.Input[str],
                 instance_count: Optional[pulumi.Input[int]] = None,
                 reservation_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ReservedInstance resource.
        :param pulumi.Input[str] offering_id: ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `rds_get_reserved_instance_offering` data source.
               
               The following arguments are optional:
        :param pulumi.Input[int] instance_count: Number of instances to reserve. Default value is `1`.
        :param pulumi.Input[str] reservation_id: Customer-specified identifier to track this reservation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "offering_id", offering_id)
        if instance_count is not None:
            pulumi.set(__self__, "instance_count", instance_count)
        if reservation_id is not None:
            pulumi.set(__self__, "reservation_id", reservation_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="offeringId")
    def offering_id(self) -> pulumi.Input[str]:
        """
        ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `rds_get_reserved_instance_offering` data source.

        The following arguments are optional:
        """
        return pulumi.get(self, "offering_id")

    @offering_id.setter
    def offering_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "offering_id", value)

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of instances to reserve. Default value is `1`.
        """
        return pulumi.get(self, "instance_count")

    @instance_count.setter
    def instance_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "instance_count", value)

    @property
    @pulumi.getter(name="reservationId")
    def reservation_id(self) -> Optional[pulumi.Input[str]]:
        """
        Customer-specified identifier to track this reservation.
        """
        return pulumi.get(self, "reservation_id")

    @reservation_id.setter
    def reservation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reservation_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ReservedInstanceState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 currency_code: Optional[pulumi.Input[str]] = None,
                 db_instance_class: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[int]] = None,
                 fixed_price: Optional[pulumi.Input[float]] = None,
                 instance_count: Optional[pulumi.Input[int]] = None,
                 lease_id: Optional[pulumi.Input[str]] = None,
                 multi_az: Optional[pulumi.Input[bool]] = None,
                 offering_id: Optional[pulumi.Input[str]] = None,
                 offering_type: Optional[pulumi.Input[str]] = None,
                 product_description: Optional[pulumi.Input[str]] = None,
                 recurring_charges: Optional[pulumi.Input[Sequence[pulumi.Input['ReservedInstanceRecurringChargeArgs']]]] = None,
                 reservation_id: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 usage_price: Optional[pulumi.Input[float]] = None):
        """
        Input properties used for looking up and filtering ReservedInstance resources.
        :param pulumi.Input[str] arn: ARN for the reserved DB instance.
        :param pulumi.Input[str] currency_code: Currency code for the reserved DB instance.
        :param pulumi.Input[str] db_instance_class: DB instance class for the reserved DB instance.
        :param pulumi.Input[int] duration: Duration of the reservation in seconds.
        :param pulumi.Input[float] fixed_price: Fixed price charged for this reserved DB instance.
        :param pulumi.Input[int] instance_count: Number of instances to reserve. Default value is `1`.
        :param pulumi.Input[str] lease_id: Unique identifier for the lease associated with the reserved DB instance. Amazon Web Services Support might request the lease ID for an issue related to a reserved DB instance.
        :param pulumi.Input[bool] multi_az: Whether the reservation applies to Multi-AZ deployments.
        :param pulumi.Input[str] offering_id: ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `rds_get_reserved_instance_offering` data source.
               
               The following arguments are optional:
        :param pulumi.Input[str] offering_type: Offering type of this reserved DB instance.
        :param pulumi.Input[str] product_description: Description of the reserved DB instance.
        :param pulumi.Input[Sequence[pulumi.Input['ReservedInstanceRecurringChargeArgs']]] recurring_charges: Recurring price charged to run this reserved DB instance.
        :param pulumi.Input[str] reservation_id: Customer-specified identifier to track this reservation.
        :param pulumi.Input[str] start_time: Time the reservation started.
        :param pulumi.Input[str] state: State of the reserved DB instance.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[float] usage_price: Hourly price charged for this reserved DB instance.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if currency_code is not None:
            pulumi.set(__self__, "currency_code", currency_code)
        if db_instance_class is not None:
            pulumi.set(__self__, "db_instance_class", db_instance_class)
        if duration is not None:
            pulumi.set(__self__, "duration", duration)
        if fixed_price is not None:
            pulumi.set(__self__, "fixed_price", fixed_price)
        if instance_count is not None:
            pulumi.set(__self__, "instance_count", instance_count)
        if lease_id is not None:
            pulumi.set(__self__, "lease_id", lease_id)
        if multi_az is not None:
            pulumi.set(__self__, "multi_az", multi_az)
        if offering_id is not None:
            pulumi.set(__self__, "offering_id", offering_id)
        if offering_type is not None:
            pulumi.set(__self__, "offering_type", offering_type)
        if product_description is not None:
            pulumi.set(__self__, "product_description", product_description)
        if recurring_charges is not None:
            pulumi.set(__self__, "recurring_charges", recurring_charges)
        if reservation_id is not None:
            pulumi.set(__self__, "reservation_id", reservation_id)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if usage_price is not None:
            pulumi.set(__self__, "usage_price", usage_price)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN for the reserved DB instance.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="currencyCode")
    def currency_code(self) -> Optional[pulumi.Input[str]]:
        """
        Currency code for the reserved DB instance.
        """
        return pulumi.get(self, "currency_code")

    @currency_code.setter
    def currency_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "currency_code", value)

    @property
    @pulumi.getter(name="dbInstanceClass")
    def db_instance_class(self) -> Optional[pulumi.Input[str]]:
        """
        DB instance class for the reserved DB instance.
        """
        return pulumi.get(self, "db_instance_class")

    @db_instance_class.setter
    def db_instance_class(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_instance_class", value)

    @property
    @pulumi.getter
    def duration(self) -> Optional[pulumi.Input[int]]:
        """
        Duration of the reservation in seconds.
        """
        return pulumi.get(self, "duration")

    @duration.setter
    def duration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration", value)

    @property
    @pulumi.getter(name="fixedPrice")
    def fixed_price(self) -> Optional[pulumi.Input[float]]:
        """
        Fixed price charged for this reserved DB instance.
        """
        return pulumi.get(self, "fixed_price")

    @fixed_price.setter
    def fixed_price(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "fixed_price", value)

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of instances to reserve. Default value is `1`.
        """
        return pulumi.get(self, "instance_count")

    @instance_count.setter
    def instance_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "instance_count", value)

    @property
    @pulumi.getter(name="leaseId")
    def lease_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the lease associated with the reserved DB instance. Amazon Web Services Support might request the lease ID for an issue related to a reserved DB instance.
        """
        return pulumi.get(self, "lease_id")

    @lease_id.setter
    def lease_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lease_id", value)

    @property
    @pulumi.getter(name="multiAz")
    def multi_az(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the reservation applies to Multi-AZ deployments.
        """
        return pulumi.get(self, "multi_az")

    @multi_az.setter
    def multi_az(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_az", value)

    @property
    @pulumi.getter(name="offeringId")
    def offering_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `rds_get_reserved_instance_offering` data source.

        The following arguments are optional:
        """
        return pulumi.get(self, "offering_id")

    @offering_id.setter
    def offering_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "offering_id", value)

    @property
    @pulumi.getter(name="offeringType")
    def offering_type(self) -> Optional[pulumi.Input[str]]:
        """
        Offering type of this reserved DB instance.
        """
        return pulumi.get(self, "offering_type")

    @offering_type.setter
    def offering_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "offering_type", value)

    @property
    @pulumi.getter(name="productDescription")
    def product_description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the reserved DB instance.
        """
        return pulumi.get(self, "product_description")

    @product_description.setter
    def product_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_description", value)

    @property
    @pulumi.getter(name="recurringCharges")
    def recurring_charges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ReservedInstanceRecurringChargeArgs']]]]:
        """
        Recurring price charged to run this reserved DB instance.
        """
        return pulumi.get(self, "recurring_charges")

    @recurring_charges.setter
    def recurring_charges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ReservedInstanceRecurringChargeArgs']]]]):
        pulumi.set(self, "recurring_charges", value)

    @property
    @pulumi.getter(name="reservationId")
    def reservation_id(self) -> Optional[pulumi.Input[str]]:
        """
        Customer-specified identifier to track this reservation.
        """
        return pulumi.get(self, "reservation_id")

    @reservation_id.setter
    def reservation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reservation_id", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        Time the reservation started.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State of the reserved DB instance.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="usagePrice")
    def usage_price(self) -> Optional[pulumi.Input[float]]:
        """
        Hourly price charged for this reserved DB instance.
        """
        return pulumi.get(self, "usage_price")

    @usage_price.setter
    def usage_price(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "usage_price", value)


class ReservedInstance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_count: Optional[pulumi.Input[int]] = None,
                 offering_id: Optional[pulumi.Input[str]] = None,
                 reservation_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages an RDS DB Reserved Instance.

        > **NOTE:** Once created, a reservation is valid for the `duration` of the provided `offering_id` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [RDS Reserved Instances Documentation](https://aws.amazon.com/rds/reserved-instances/) and [PurchaseReservedDBInstancesOffering](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_PurchaseReservedDBInstancesOffering.html).

        > **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.rds.get_reserved_instance_offering(db_instance_class="db.t2.micro",
            duration=31536000,
            multi_az=False,
            offering_type="All Upfront",
            product_description="mysql")
        example = aws.rds.ReservedInstance("example",
            offering_id=test.offering_id,
            reservation_id="optionalCustomReservationID",
            instance_count=3)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import RDS DB Instance Reservations using the `instance_id`. For example:

        ```sh
        $ pulumi import aws:rds/reservedInstance:ReservedInstance reservation_instance CustomReservationID
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] instance_count: Number of instances to reserve. Default value is `1`.
        :param pulumi.Input[str] offering_id: ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `rds_get_reserved_instance_offering` data source.
               
               The following arguments are optional:
        :param pulumi.Input[str] reservation_id: Customer-specified identifier to track this reservation.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ReservedInstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an RDS DB Reserved Instance.

        > **NOTE:** Once created, a reservation is valid for the `duration` of the provided `offering_id` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [RDS Reserved Instances Documentation](https://aws.amazon.com/rds/reserved-instances/) and [PurchaseReservedDBInstancesOffering](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_PurchaseReservedDBInstancesOffering.html).

        > **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.rds.get_reserved_instance_offering(db_instance_class="db.t2.micro",
            duration=31536000,
            multi_az=False,
            offering_type="All Upfront",
            product_description="mysql")
        example = aws.rds.ReservedInstance("example",
            offering_id=test.offering_id,
            reservation_id="optionalCustomReservationID",
            instance_count=3)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import RDS DB Instance Reservations using the `instance_id`. For example:

        ```sh
        $ pulumi import aws:rds/reservedInstance:ReservedInstance reservation_instance CustomReservationID
        ```

        :param str resource_name: The name of the resource.
        :param ReservedInstanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ReservedInstanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_count: Optional[pulumi.Input[int]] = None,
                 offering_id: Optional[pulumi.Input[str]] = None,
                 reservation_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ReservedInstanceArgs.__new__(ReservedInstanceArgs)

            __props__.__dict__["instance_count"] = instance_count
            if offering_id is None and not opts.urn:
                raise TypeError("Missing required property 'offering_id'")
            __props__.__dict__["offering_id"] = offering_id
            __props__.__dict__["reservation_id"] = reservation_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["currency_code"] = None
            __props__.__dict__["db_instance_class"] = None
            __props__.__dict__["duration"] = None
            __props__.__dict__["fixed_price"] = None
            __props__.__dict__["lease_id"] = None
            __props__.__dict__["multi_az"] = None
            __props__.__dict__["offering_type"] = None
            __props__.__dict__["product_description"] = None
            __props__.__dict__["recurring_charges"] = None
            __props__.__dict__["start_time"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["usage_price"] = None
        super(ReservedInstance, __self__).__init__(
            'aws:rds/reservedInstance:ReservedInstance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            currency_code: Optional[pulumi.Input[str]] = None,
            db_instance_class: Optional[pulumi.Input[str]] = None,
            duration: Optional[pulumi.Input[int]] = None,
            fixed_price: Optional[pulumi.Input[float]] = None,
            instance_count: Optional[pulumi.Input[int]] = None,
            lease_id: Optional[pulumi.Input[str]] = None,
            multi_az: Optional[pulumi.Input[bool]] = None,
            offering_id: Optional[pulumi.Input[str]] = None,
            offering_type: Optional[pulumi.Input[str]] = None,
            product_description: Optional[pulumi.Input[str]] = None,
            recurring_charges: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ReservedInstanceRecurringChargeArgs']]]]] = None,
            reservation_id: Optional[pulumi.Input[str]] = None,
            start_time: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            usage_price: Optional[pulumi.Input[float]] = None) -> 'ReservedInstance':
        """
        Get an existing ReservedInstance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN for the reserved DB instance.
        :param pulumi.Input[str] currency_code: Currency code for the reserved DB instance.
        :param pulumi.Input[str] db_instance_class: DB instance class for the reserved DB instance.
        :param pulumi.Input[int] duration: Duration of the reservation in seconds.
        :param pulumi.Input[float] fixed_price: Fixed price charged for this reserved DB instance.
        :param pulumi.Input[int] instance_count: Number of instances to reserve. Default value is `1`.
        :param pulumi.Input[str] lease_id: Unique identifier for the lease associated with the reserved DB instance. Amazon Web Services Support might request the lease ID for an issue related to a reserved DB instance.
        :param pulumi.Input[bool] multi_az: Whether the reservation applies to Multi-AZ deployments.
        :param pulumi.Input[str] offering_id: ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `rds_get_reserved_instance_offering` data source.
               
               The following arguments are optional:
        :param pulumi.Input[str] offering_type: Offering type of this reserved DB instance.
        :param pulumi.Input[str] product_description: Description of the reserved DB instance.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ReservedInstanceRecurringChargeArgs']]]] recurring_charges: Recurring price charged to run this reserved DB instance.
        :param pulumi.Input[str] reservation_id: Customer-specified identifier to track this reservation.
        :param pulumi.Input[str] start_time: Time the reservation started.
        :param pulumi.Input[str] state: State of the reserved DB instance.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[float] usage_price: Hourly price charged for this reserved DB instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ReservedInstanceState.__new__(_ReservedInstanceState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["currency_code"] = currency_code
        __props__.__dict__["db_instance_class"] = db_instance_class
        __props__.__dict__["duration"] = duration
        __props__.__dict__["fixed_price"] = fixed_price
        __props__.__dict__["instance_count"] = instance_count
        __props__.__dict__["lease_id"] = lease_id
        __props__.__dict__["multi_az"] = multi_az
        __props__.__dict__["offering_id"] = offering_id
        __props__.__dict__["offering_type"] = offering_type
        __props__.__dict__["product_description"] = product_description
        __props__.__dict__["recurring_charges"] = recurring_charges
        __props__.__dict__["reservation_id"] = reservation_id
        __props__.__dict__["start_time"] = start_time
        __props__.__dict__["state"] = state
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["usage_price"] = usage_price
        return ReservedInstance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN for the reserved DB instance.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="currencyCode")
    def currency_code(self) -> pulumi.Output[str]:
        """
        Currency code for the reserved DB instance.
        """
        return pulumi.get(self, "currency_code")

    @property
    @pulumi.getter(name="dbInstanceClass")
    def db_instance_class(self) -> pulumi.Output[str]:
        """
        DB instance class for the reserved DB instance.
        """
        return pulumi.get(self, "db_instance_class")

    @property
    @pulumi.getter
    def duration(self) -> pulumi.Output[int]:
        """
        Duration of the reservation in seconds.
        """
        return pulumi.get(self, "duration")

    @property
    @pulumi.getter(name="fixedPrice")
    def fixed_price(self) -> pulumi.Output[float]:
        """
        Fixed price charged for this reserved DB instance.
        """
        return pulumi.get(self, "fixed_price")

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> pulumi.Output[Optional[int]]:
        """
        Number of instances to reserve. Default value is `1`.
        """
        return pulumi.get(self, "instance_count")

    @property
    @pulumi.getter(name="leaseId")
    def lease_id(self) -> pulumi.Output[str]:
        """
        Unique identifier for the lease associated with the reserved DB instance. Amazon Web Services Support might request the lease ID for an issue related to a reserved DB instance.
        """
        return pulumi.get(self, "lease_id")

    @property
    @pulumi.getter(name="multiAz")
    def multi_az(self) -> pulumi.Output[bool]:
        """
        Whether the reservation applies to Multi-AZ deployments.
        """
        return pulumi.get(self, "multi_az")

    @property
    @pulumi.getter(name="offeringId")
    def offering_id(self) -> pulumi.Output[str]:
        """
        ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `rds_get_reserved_instance_offering` data source.

        The following arguments are optional:
        """
        return pulumi.get(self, "offering_id")

    @property
    @pulumi.getter(name="offeringType")
    def offering_type(self) -> pulumi.Output[str]:
        """
        Offering type of this reserved DB instance.
        """
        return pulumi.get(self, "offering_type")

    @property
    @pulumi.getter(name="productDescription")
    def product_description(self) -> pulumi.Output[str]:
        """
        Description of the reserved DB instance.
        """
        return pulumi.get(self, "product_description")

    @property
    @pulumi.getter(name="recurringCharges")
    def recurring_charges(self) -> pulumi.Output[Sequence['outputs.ReservedInstanceRecurringCharge']]:
        """
        Recurring price charged to run this reserved DB instance.
        """
        return pulumi.get(self, "recurring_charges")

    @property
    @pulumi.getter(name="reservationId")
    def reservation_id(self) -> pulumi.Output[Optional[str]]:
        """
        Customer-specified identifier to track this reservation.
        """
        return pulumi.get(self, "reservation_id")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[str]:
        """
        Time the reservation started.
        """
        return pulumi.get(self, "start_time")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        State of the reserved DB instance.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="usagePrice")
    def usage_price(self) -> pulumi.Output[float]:
        """
        Hourly price charged for this reserved DB instance.
        """
        return pulumi.get(self, "usage_price")

