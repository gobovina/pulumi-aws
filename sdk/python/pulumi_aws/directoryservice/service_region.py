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

__all__ = ['ServiceRegionArgs', 'ServiceRegion']

@pulumi.input_type
class ServiceRegionArgs:
    def __init__(__self__, *,
                 directory_id: pulumi.Input[str],
                 region_name: pulumi.Input[str],
                 vpc_settings: pulumi.Input['ServiceRegionVpcSettingsArgs'],
                 desired_number_of_domain_controllers: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ServiceRegion resource.
        :param pulumi.Input[str] directory_id: The identifier of the directory to which you want to add Region replication.
        :param pulumi.Input[str] region_name: The name of the Region where you want to add domain controllers for replication.
        :param pulumi.Input['ServiceRegionVpcSettingsArgs'] vpc_settings: VPC information in the replicated Region. Detailed below.
        :param pulumi.Input[int] desired_number_of_domain_controllers: The number of domain controllers desired in the replicated directory. Minimum value of `2`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "directory_id", directory_id)
        pulumi.set(__self__, "region_name", region_name)
        pulumi.set(__self__, "vpc_settings", vpc_settings)
        if desired_number_of_domain_controllers is not None:
            pulumi.set(__self__, "desired_number_of_domain_controllers", desired_number_of_domain_controllers)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Input[str]:
        """
        The identifier of the directory to which you want to add Region replication.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> pulumi.Input[str]:
        """
        The name of the Region where you want to add domain controllers for replication.
        """
        return pulumi.get(self, "region_name")

    @region_name.setter
    def region_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "region_name", value)

    @property
    @pulumi.getter(name="vpcSettings")
    def vpc_settings(self) -> pulumi.Input['ServiceRegionVpcSettingsArgs']:
        """
        VPC information in the replicated Region. Detailed below.
        """
        return pulumi.get(self, "vpc_settings")

    @vpc_settings.setter
    def vpc_settings(self, value: pulumi.Input['ServiceRegionVpcSettingsArgs']):
        pulumi.set(self, "vpc_settings", value)

    @property
    @pulumi.getter(name="desiredNumberOfDomainControllers")
    def desired_number_of_domain_controllers(self) -> Optional[pulumi.Input[int]]:
        """
        The number of domain controllers desired in the replicated directory. Minimum value of `2`.
        """
        return pulumi.get(self, "desired_number_of_domain_controllers")

    @desired_number_of_domain_controllers.setter
    def desired_number_of_domain_controllers(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "desired_number_of_domain_controllers", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ServiceRegionState:
    def __init__(__self__, *,
                 desired_number_of_domain_controllers: Optional[pulumi.Input[int]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 region_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_settings: Optional[pulumi.Input['ServiceRegionVpcSettingsArgs']] = None):
        """
        Input properties used for looking up and filtering ServiceRegion resources.
        :param pulumi.Input[int] desired_number_of_domain_controllers: The number of domain controllers desired in the replicated directory. Minimum value of `2`.
        :param pulumi.Input[str] directory_id: The identifier of the directory to which you want to add Region replication.
        :param pulumi.Input[str] region_name: The name of the Region where you want to add domain controllers for replication.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input['ServiceRegionVpcSettingsArgs'] vpc_settings: VPC information in the replicated Region. Detailed below.
        """
        if desired_number_of_domain_controllers is not None:
            pulumi.set(__self__, "desired_number_of_domain_controllers", desired_number_of_domain_controllers)
        if directory_id is not None:
            pulumi.set(__self__, "directory_id", directory_id)
        if region_name is not None:
            pulumi.set(__self__, "region_name", region_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if vpc_settings is not None:
            pulumi.set(__self__, "vpc_settings", vpc_settings)

    @property
    @pulumi.getter(name="desiredNumberOfDomainControllers")
    def desired_number_of_domain_controllers(self) -> Optional[pulumi.Input[int]]:
        """
        The number of domain controllers desired in the replicated directory. Minimum value of `2`.
        """
        return pulumi.get(self, "desired_number_of_domain_controllers")

    @desired_number_of_domain_controllers.setter
    def desired_number_of_domain_controllers(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "desired_number_of_domain_controllers", value)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of the directory to which you want to add Region replication.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Region where you want to add domain controllers for replication.
        """
        return pulumi.get(self, "region_name")

    @region_name.setter
    def region_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="vpcSettings")
    def vpc_settings(self) -> Optional[pulumi.Input['ServiceRegionVpcSettingsArgs']]:
        """
        VPC information in the replicated Region. Detailed below.
        """
        return pulumi.get(self, "vpc_settings")

    @vpc_settings.setter
    def vpc_settings(self, value: Optional[pulumi.Input['ServiceRegionVpcSettingsArgs']]):
        pulumi.set(self, "vpc_settings", value)


class ServiceRegion(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 desired_number_of_domain_controllers: Optional[pulumi.Input[int]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 region_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_settings: Optional[pulumi.Input[pulumi.InputType['ServiceRegionVpcSettingsArgs']]] = None,
                 __props__=None):
        """
        Manages a replicated Region and directory for Multi-Region replication.
        Multi-Region replication is only supported for the Enterprise Edition of AWS Managed Microsoft AD.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.get_region()
        available = aws.get_availability_zones(state="available",
            filters=[aws.GetAvailabilityZonesFilterArgs(
                name="opt-in-status",
                values=["opt-in-not-required"],
            )])
        example_vpc = aws.ec2.Vpc("example",
            cidr_block="10.0.0.0/16",
            tags={
                "Name": "Primary",
            })
        example_subnet = []
        for range in [{"value": i} for i in range(0, 2)]:
            example_subnet.append(aws.ec2.Subnet(f"example-{range['value']}",
                vpc_id=example_vpc.id,
                availability_zone=available.names[range["value"]],
                cidr_block=example_vpc.cidr_block.apply(lambda cidr_block: std.cidrsubnet_output(input=cidr_block,
                    newbits=8,
                    netnum=range["value"])).apply(lambda invoke: invoke.result),
                tags={
                    "Name": "Primary",
                }))
        example_directory = aws.directoryservice.Directory("example",
            name="example.com",
            password="SuperSecretPassw0rd",
            type="MicrosoftAD",
            vpc_settings=aws.directoryservice.DirectoryVpcSettingsArgs(
                vpc_id=example_vpc.id,
                subnet_ids=[__item.id for __item in example_subnet],
            ))
        available_secondary = aws.get_availability_zones(state="available",
            filters=[aws.GetAvailabilityZonesFilterArgs(
                name="opt-in-status",
                values=["opt-in-not-required"],
            )])
        example_secondary = aws.ec2.Vpc("example-secondary",
            cidr_block="10.1.0.0/16",
            tags={
                "Name": "Secondary",
            })
        example_secondary_subnet = []
        for range in [{"value": i} for i in range(0, 2)]:
            example_secondary_subnet.append(aws.ec2.Subnet(f"example-secondary-{range['value']}",
                vpc_id=example_secondary.id,
                availability_zone=available_secondary.names[range["value"]],
                cidr_block=example_secondary.cidr_block.apply(lambda cidr_block: std.cidrsubnet_output(input=cidr_block,
                    newbits=8,
                    netnum=range["value"])).apply(lambda invoke: invoke.result),
                tags={
                    "Name": "Secondary",
                }))
        example_service_region = aws.directoryservice.ServiceRegion("example",
            directory_id=example_directory.id,
            region_name=example.name,
            vpc_settings=aws.directoryservice.ServiceRegionVpcSettingsArgs(
                vpc_id=example_secondary.id,
                subnet_ids=[__item.id for __item in example_secondary_subnet],
            ),
            tags={
                "Name": "Secondary",
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Replicated Regions using directory ID,Region name. For example:

        ```sh
        $ pulumi import aws:directoryservice/serviceRegion:ServiceRegion example d-9267651497,us-east-2
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] desired_number_of_domain_controllers: The number of domain controllers desired in the replicated directory. Minimum value of `2`.
        :param pulumi.Input[str] directory_id: The identifier of the directory to which you want to add Region replication.
        :param pulumi.Input[str] region_name: The name of the Region where you want to add domain controllers for replication.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[pulumi.InputType['ServiceRegionVpcSettingsArgs']] vpc_settings: VPC information in the replicated Region. Detailed below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceRegionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a replicated Region and directory for Multi-Region replication.
        Multi-Region replication is only supported for the Enterprise Edition of AWS Managed Microsoft AD.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.get_region()
        available = aws.get_availability_zones(state="available",
            filters=[aws.GetAvailabilityZonesFilterArgs(
                name="opt-in-status",
                values=["opt-in-not-required"],
            )])
        example_vpc = aws.ec2.Vpc("example",
            cidr_block="10.0.0.0/16",
            tags={
                "Name": "Primary",
            })
        example_subnet = []
        for range in [{"value": i} for i in range(0, 2)]:
            example_subnet.append(aws.ec2.Subnet(f"example-{range['value']}",
                vpc_id=example_vpc.id,
                availability_zone=available.names[range["value"]],
                cidr_block=example_vpc.cidr_block.apply(lambda cidr_block: std.cidrsubnet_output(input=cidr_block,
                    newbits=8,
                    netnum=range["value"])).apply(lambda invoke: invoke.result),
                tags={
                    "Name": "Primary",
                }))
        example_directory = aws.directoryservice.Directory("example",
            name="example.com",
            password="SuperSecretPassw0rd",
            type="MicrosoftAD",
            vpc_settings=aws.directoryservice.DirectoryVpcSettingsArgs(
                vpc_id=example_vpc.id,
                subnet_ids=[__item.id for __item in example_subnet],
            ))
        available_secondary = aws.get_availability_zones(state="available",
            filters=[aws.GetAvailabilityZonesFilterArgs(
                name="opt-in-status",
                values=["opt-in-not-required"],
            )])
        example_secondary = aws.ec2.Vpc("example-secondary",
            cidr_block="10.1.0.0/16",
            tags={
                "Name": "Secondary",
            })
        example_secondary_subnet = []
        for range in [{"value": i} for i in range(0, 2)]:
            example_secondary_subnet.append(aws.ec2.Subnet(f"example-secondary-{range['value']}",
                vpc_id=example_secondary.id,
                availability_zone=available_secondary.names[range["value"]],
                cidr_block=example_secondary.cidr_block.apply(lambda cidr_block: std.cidrsubnet_output(input=cidr_block,
                    newbits=8,
                    netnum=range["value"])).apply(lambda invoke: invoke.result),
                tags={
                    "Name": "Secondary",
                }))
        example_service_region = aws.directoryservice.ServiceRegion("example",
            directory_id=example_directory.id,
            region_name=example.name,
            vpc_settings=aws.directoryservice.ServiceRegionVpcSettingsArgs(
                vpc_id=example_secondary.id,
                subnet_ids=[__item.id for __item in example_secondary_subnet],
            ),
            tags={
                "Name": "Secondary",
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Replicated Regions using directory ID,Region name. For example:

        ```sh
        $ pulumi import aws:directoryservice/serviceRegion:ServiceRegion example d-9267651497,us-east-2
        ```

        :param str resource_name: The name of the resource.
        :param ServiceRegionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceRegionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 desired_number_of_domain_controllers: Optional[pulumi.Input[int]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 region_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_settings: Optional[pulumi.Input[pulumi.InputType['ServiceRegionVpcSettingsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceRegionArgs.__new__(ServiceRegionArgs)

            __props__.__dict__["desired_number_of_domain_controllers"] = desired_number_of_domain_controllers
            if directory_id is None and not opts.urn:
                raise TypeError("Missing required property 'directory_id'")
            __props__.__dict__["directory_id"] = directory_id
            if region_name is None and not opts.urn:
                raise TypeError("Missing required property 'region_name'")
            __props__.__dict__["region_name"] = region_name
            __props__.__dict__["tags"] = tags
            if vpc_settings is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_settings'")
            __props__.__dict__["vpc_settings"] = vpc_settings
            __props__.__dict__["tags_all"] = None
        super(ServiceRegion, __self__).__init__(
            'aws:directoryservice/serviceRegion:ServiceRegion',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            desired_number_of_domain_controllers: Optional[pulumi.Input[int]] = None,
            directory_id: Optional[pulumi.Input[str]] = None,
            region_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_settings: Optional[pulumi.Input[pulumi.InputType['ServiceRegionVpcSettingsArgs']]] = None) -> 'ServiceRegion':
        """
        Get an existing ServiceRegion resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] desired_number_of_domain_controllers: The number of domain controllers desired in the replicated directory. Minimum value of `2`.
        :param pulumi.Input[str] directory_id: The identifier of the directory to which you want to add Region replication.
        :param pulumi.Input[str] region_name: The name of the Region where you want to add domain controllers for replication.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[pulumi.InputType['ServiceRegionVpcSettingsArgs']] vpc_settings: VPC information in the replicated Region. Detailed below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceRegionState.__new__(_ServiceRegionState)

        __props__.__dict__["desired_number_of_domain_controllers"] = desired_number_of_domain_controllers
        __props__.__dict__["directory_id"] = directory_id
        __props__.__dict__["region_name"] = region_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["vpc_settings"] = vpc_settings
        return ServiceRegion(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="desiredNumberOfDomainControllers")
    def desired_number_of_domain_controllers(self) -> pulumi.Output[int]:
        """
        The number of domain controllers desired in the replicated directory. Minimum value of `2`.
        """
        return pulumi.get(self, "desired_number_of_domain_controllers")

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Output[str]:
        """
        The identifier of the directory to which you want to add Region replication.
        """
        return pulumi.get(self, "directory_id")

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> pulumi.Output[str]:
        """
        The name of the Region where you want to add domain controllers for replication.
        """
        return pulumi.get(self, "region_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="vpcSettings")
    def vpc_settings(self) -> pulumi.Output['outputs.ServiceRegionVpcSettings']:
        """
        VPC information in the replicated Region. Detailed below.
        """
        return pulumi.get(self, "vpc_settings")

