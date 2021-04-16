# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ZoneAssociationArgs', 'ZoneAssociation']

@pulumi.input_type
class ZoneAssociationArgs:
    def __init__(__self__, *,
                 vpc_id: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 vpc_region: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ZoneAssociation resource.
        :param pulumi.Input[str] vpc_id: The VPC to associate with the private hosted zone.
        :param pulumi.Input[str] zone_id: The private hosted zone to associate.
        :param pulumi.Input[str] vpc_region: The VPC's region. Defaults to the region of the AWS provider.
        """
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "zone_id", zone_id)
        if vpc_region is not None:
            pulumi.set(__self__, "vpc_region", vpc_region)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The VPC to associate with the private hosted zone.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The private hosted zone to associate.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="vpcRegion")
    def vpc_region(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC's region. Defaults to the region of the AWS provider.
        """
        return pulumi.get(self, "vpc_region")

    @vpc_region.setter
    def vpc_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_region", value)


@pulumi.input_type
class _ZoneAssociationState:
    def __init__(__self__, *,
                 owning_account: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vpc_region: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ZoneAssociation resources.
        :param pulumi.Input[str] owning_account: The account ID of the account that created the hosted zone.
        :param pulumi.Input[str] vpc_id: The VPC to associate with the private hosted zone.
        :param pulumi.Input[str] vpc_region: The VPC's region. Defaults to the region of the AWS provider.
        :param pulumi.Input[str] zone_id: The private hosted zone to associate.
        """
        if owning_account is not None:
            pulumi.set(__self__, "owning_account", owning_account)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if vpc_region is not None:
            pulumi.set(__self__, "vpc_region", vpc_region)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="owningAccount")
    def owning_account(self) -> Optional[pulumi.Input[str]]:
        """
        The account ID of the account that created the hosted zone.
        """
        return pulumi.get(self, "owning_account")

    @owning_account.setter
    def owning_account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owning_account", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC to associate with the private hosted zone.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vpcRegion")
    def vpc_region(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC's region. Defaults to the region of the AWS provider.
        """
        return pulumi.get(self, "vpc_region")

    @vpc_region.setter
    def vpc_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_region", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The private hosted zone to associate.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class ZoneAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vpc_region: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Route53 Hosted Zone VPC association. VPC associations can only be made on private zones. See the `route53.VpcAssociationAuthorization` resource for setting up cross-account associations.

        > **NOTE:** Unless explicit association ordering is required (e.g. a separate cross-account association authorization), usage of this resource is not recommended. Use the `vpc` configuration blocks available within the `route53.Zone` resource instead.

        > **NOTE:** This provider provides both this standalone Zone VPC Association resource and exclusive VPC associations defined in-line in the `route53.Zone` resource via `vpc` configuration blocks. At this time, you cannot use those in-line VPC associations in conjunction with this resource and the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) in the `route53.Zone` resource to manage additional associations via this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        primary = aws.ec2.Vpc("primary",
            cidr_block="10.6.0.0/16",
            enable_dns_hostnames=True,
            enable_dns_support=True)
        secondary_vpc = aws.ec2.Vpc("secondaryVpc",
            cidr_block="10.7.0.0/16",
            enable_dns_hostnames=True,
            enable_dns_support=True)
        example = aws.route53.Zone("example", vpcs=[aws.route53.ZoneVpcArgs(
            vpc_id=primary.id,
        )])
        secondary_zone_association = aws.route53.ZoneAssociation("secondaryZoneAssociation",
            zone_id=example.zone_id,
            vpc_id=secondary_vpc.id)
        ```

        ## Import

        Route 53 Hosted Zone Associations can be imported via the Hosted Zone ID and VPC ID, separated by a colon (`:`), e.g.

        ```sh
         $ pulumi import aws:route53/zoneAssociation:ZoneAssociation example Z123456ABCDEFG:vpc-12345678
        ```

         If the VPC is in a different region than the provider region configuration, the VPC Region can be added to the end. e.g.

        ```sh
         $ pulumi import aws:route53/zoneAssociation:ZoneAssociation example Z123456ABCDEFG:vpc-12345678:us-east-2
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] vpc_id: The VPC to associate with the private hosted zone.
        :param pulumi.Input[str] vpc_region: The VPC's region. Defaults to the region of the AWS provider.
        :param pulumi.Input[str] zone_id: The private hosted zone to associate.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZoneAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Route53 Hosted Zone VPC association. VPC associations can only be made on private zones. See the `route53.VpcAssociationAuthorization` resource for setting up cross-account associations.

        > **NOTE:** Unless explicit association ordering is required (e.g. a separate cross-account association authorization), usage of this resource is not recommended. Use the `vpc` configuration blocks available within the `route53.Zone` resource instead.

        > **NOTE:** This provider provides both this standalone Zone VPC Association resource and exclusive VPC associations defined in-line in the `route53.Zone` resource via `vpc` configuration blocks. At this time, you cannot use those in-line VPC associations in conjunction with this resource and the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) in the `route53.Zone` resource to manage additional associations via this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        primary = aws.ec2.Vpc("primary",
            cidr_block="10.6.0.0/16",
            enable_dns_hostnames=True,
            enable_dns_support=True)
        secondary_vpc = aws.ec2.Vpc("secondaryVpc",
            cidr_block="10.7.0.0/16",
            enable_dns_hostnames=True,
            enable_dns_support=True)
        example = aws.route53.Zone("example", vpcs=[aws.route53.ZoneVpcArgs(
            vpc_id=primary.id,
        )])
        secondary_zone_association = aws.route53.ZoneAssociation("secondaryZoneAssociation",
            zone_id=example.zone_id,
            vpc_id=secondary_vpc.id)
        ```

        ## Import

        Route 53 Hosted Zone Associations can be imported via the Hosted Zone ID and VPC ID, separated by a colon (`:`), e.g.

        ```sh
         $ pulumi import aws:route53/zoneAssociation:ZoneAssociation example Z123456ABCDEFG:vpc-12345678
        ```

         If the VPC is in a different region than the provider region configuration, the VPC Region can be added to the end. e.g.

        ```sh
         $ pulumi import aws:route53/zoneAssociation:ZoneAssociation example Z123456ABCDEFG:vpc-12345678:us-east-2
        ```

        :param str resource_name: The name of the resource.
        :param ZoneAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZoneAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vpc_region: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = ZoneAssociationArgs.__new__(ZoneAssociationArgs)

            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["vpc_region"] = vpc_region
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["owning_account"] = None
        super(ZoneAssociation, __self__).__init__(
            'aws:route53/zoneAssociation:ZoneAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            owning_account: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vpc_region: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'ZoneAssociation':
        """
        Get an existing ZoneAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] owning_account: The account ID of the account that created the hosted zone.
        :param pulumi.Input[str] vpc_id: The VPC to associate with the private hosted zone.
        :param pulumi.Input[str] vpc_region: The VPC's region. Defaults to the region of the AWS provider.
        :param pulumi.Input[str] zone_id: The private hosted zone to associate.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZoneAssociationState.__new__(_ZoneAssociationState)

        __props__.__dict__["owning_account"] = owning_account
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["vpc_region"] = vpc_region
        __props__.__dict__["zone_id"] = zone_id
        return ZoneAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="owningAccount")
    def owning_account(self) -> pulumi.Output[str]:
        """
        The account ID of the account that created the hosted zone.
        """
        return pulumi.get(self, "owning_account")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The VPC to associate with the private hosted zone.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vpcRegion")
    def vpc_region(self) -> pulumi.Output[str]:
        """
        The VPC's region. Defaults to the region of the AWS provider.
        """
        return pulumi.get(self, "vpc_region")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The private hosted zone to associate.
        """
        return pulumi.get(self, "zone_id")

