# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['GatewayAssociationArgs', 'GatewayAssociation']

@pulumi.input_type
class GatewayAssociationArgs:
    def __init__(__self__, *,
                 dx_gateway_id: pulumi.Input[str],
                 allowed_prefixes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 associated_gateway_id: Optional[pulumi.Input[str]] = None,
                 associated_gateway_owner_account_id: Optional[pulumi.Input[str]] = None,
                 proposal_id: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a GatewayAssociation resource.
        :param pulumi.Input[str] dx_gateway_id: The ID of the Direct Connect gateway.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_prefixes: VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
        :param pulumi.Input[str] associated_gateway_id: The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
               Used for single account Direct Connect gateway associations.
        :param pulumi.Input[str] associated_gateway_owner_account_id: The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
               Used for cross-account Direct Connect gateway associations.
        :param pulumi.Input[str] proposal_id: The ID of the Direct Connect gateway association proposal.
               Used for cross-account Direct Connect gateway associations.
        """
        pulumi.set(__self__, "dx_gateway_id", dx_gateway_id)
        if allowed_prefixes is not None:
            pulumi.set(__self__, "allowed_prefixes", allowed_prefixes)
        if associated_gateway_id is not None:
            pulumi.set(__self__, "associated_gateway_id", associated_gateway_id)
        if associated_gateway_owner_account_id is not None:
            pulumi.set(__self__, "associated_gateway_owner_account_id", associated_gateway_owner_account_id)
        if proposal_id is not None:
            pulumi.set(__self__, "proposal_id", proposal_id)
        if vpn_gateway_id is not None:
            warnings.warn("""use 'associated_gateway_id' argument instead""", DeprecationWarning)
            pulumi.log.warn("""vpn_gateway_id is deprecated: use 'associated_gateway_id' argument instead""")
        if vpn_gateway_id is not None:
            pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)

    @property
    @pulumi.getter(name="dxGatewayId")
    def dx_gateway_id(self) -> pulumi.Input[str]:
        """
        The ID of the Direct Connect gateway.
        """
        return pulumi.get(self, "dx_gateway_id")

    @dx_gateway_id.setter
    def dx_gateway_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "dx_gateway_id", value)

    @property
    @pulumi.getter(name="allowedPrefixes")
    def allowed_prefixes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
        """
        return pulumi.get(self, "allowed_prefixes")

    @allowed_prefixes.setter
    def allowed_prefixes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_prefixes", value)

    @property
    @pulumi.getter(name="associatedGatewayId")
    def associated_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
        Used for single account Direct Connect gateway associations.
        """
        return pulumi.get(self, "associated_gateway_id")

    @associated_gateway_id.setter
    def associated_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "associated_gateway_id", value)

    @property
    @pulumi.getter(name="associatedGatewayOwnerAccountId")
    def associated_gateway_owner_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
        Used for cross-account Direct Connect gateway associations.
        """
        return pulumi.get(self, "associated_gateway_owner_account_id")

    @associated_gateway_owner_account_id.setter
    def associated_gateway_owner_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "associated_gateway_owner_account_id", value)

    @property
    @pulumi.getter(name="proposalId")
    def proposal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Direct Connect gateway association proposal.
        Used for cross-account Direct Connect gateway associations.
        """
        return pulumi.get(self, "proposal_id")

    @proposal_id.setter
    def proposal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "proposal_id", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> Optional[pulumi.Input[str]]:
        warnings.warn("""use 'associated_gateway_id' argument instead""", DeprecationWarning)
        pulumi.log.warn("""vpn_gateway_id is deprecated: use 'associated_gateway_id' argument instead""")

        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_gateway_id", value)


@pulumi.input_type
class _GatewayAssociationState:
    def __init__(__self__, *,
                 allowed_prefixes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 associated_gateway_id: Optional[pulumi.Input[str]] = None,
                 associated_gateway_owner_account_id: Optional[pulumi.Input[str]] = None,
                 associated_gateway_type: Optional[pulumi.Input[str]] = None,
                 dx_gateway_association_id: Optional[pulumi.Input[str]] = None,
                 dx_gateway_id: Optional[pulumi.Input[str]] = None,
                 dx_gateway_owner_account_id: Optional[pulumi.Input[str]] = None,
                 proposal_id: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GatewayAssociation resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_prefixes: VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
        :param pulumi.Input[str] associated_gateway_id: The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
               Used for single account Direct Connect gateway associations.
        :param pulumi.Input[str] associated_gateway_owner_account_id: The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
               Used for cross-account Direct Connect gateway associations.
        :param pulumi.Input[str] associated_gateway_type: The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
        :param pulumi.Input[str] dx_gateway_association_id: The ID of the Direct Connect gateway association.
        :param pulumi.Input[str] dx_gateway_id: The ID of the Direct Connect gateway.
        :param pulumi.Input[str] dx_gateway_owner_account_id: The ID of the AWS account that owns the Direct Connect gateway.
        :param pulumi.Input[str] proposal_id: The ID of the Direct Connect gateway association proposal.
               Used for cross-account Direct Connect gateway associations.
        """
        if allowed_prefixes is not None:
            pulumi.set(__self__, "allowed_prefixes", allowed_prefixes)
        if associated_gateway_id is not None:
            pulumi.set(__self__, "associated_gateway_id", associated_gateway_id)
        if associated_gateway_owner_account_id is not None:
            pulumi.set(__self__, "associated_gateway_owner_account_id", associated_gateway_owner_account_id)
        if associated_gateway_type is not None:
            pulumi.set(__self__, "associated_gateway_type", associated_gateway_type)
        if dx_gateway_association_id is not None:
            pulumi.set(__self__, "dx_gateway_association_id", dx_gateway_association_id)
        if dx_gateway_id is not None:
            pulumi.set(__self__, "dx_gateway_id", dx_gateway_id)
        if dx_gateway_owner_account_id is not None:
            pulumi.set(__self__, "dx_gateway_owner_account_id", dx_gateway_owner_account_id)
        if proposal_id is not None:
            pulumi.set(__self__, "proposal_id", proposal_id)
        if vpn_gateway_id is not None:
            warnings.warn("""use 'associated_gateway_id' argument instead""", DeprecationWarning)
            pulumi.log.warn("""vpn_gateway_id is deprecated: use 'associated_gateway_id' argument instead""")
        if vpn_gateway_id is not None:
            pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)

    @property
    @pulumi.getter(name="allowedPrefixes")
    def allowed_prefixes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
        """
        return pulumi.get(self, "allowed_prefixes")

    @allowed_prefixes.setter
    def allowed_prefixes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_prefixes", value)

    @property
    @pulumi.getter(name="associatedGatewayId")
    def associated_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
        Used for single account Direct Connect gateway associations.
        """
        return pulumi.get(self, "associated_gateway_id")

    @associated_gateway_id.setter
    def associated_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "associated_gateway_id", value)

    @property
    @pulumi.getter(name="associatedGatewayOwnerAccountId")
    def associated_gateway_owner_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
        Used for cross-account Direct Connect gateway associations.
        """
        return pulumi.get(self, "associated_gateway_owner_account_id")

    @associated_gateway_owner_account_id.setter
    def associated_gateway_owner_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "associated_gateway_owner_account_id", value)

    @property
    @pulumi.getter(name="associatedGatewayType")
    def associated_gateway_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
        """
        return pulumi.get(self, "associated_gateway_type")

    @associated_gateway_type.setter
    def associated_gateway_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "associated_gateway_type", value)

    @property
    @pulumi.getter(name="dxGatewayAssociationId")
    def dx_gateway_association_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Direct Connect gateway association.
        """
        return pulumi.get(self, "dx_gateway_association_id")

    @dx_gateway_association_id.setter
    def dx_gateway_association_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dx_gateway_association_id", value)

    @property
    @pulumi.getter(name="dxGatewayId")
    def dx_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Direct Connect gateway.
        """
        return pulumi.get(self, "dx_gateway_id")

    @dx_gateway_id.setter
    def dx_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dx_gateway_id", value)

    @property
    @pulumi.getter(name="dxGatewayOwnerAccountId")
    def dx_gateway_owner_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the AWS account that owns the Direct Connect gateway.
        """
        return pulumi.get(self, "dx_gateway_owner_account_id")

    @dx_gateway_owner_account_id.setter
    def dx_gateway_owner_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dx_gateway_owner_account_id", value)

    @property
    @pulumi.getter(name="proposalId")
    def proposal_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Direct Connect gateway association proposal.
        Used for cross-account Direct Connect gateway associations.
        """
        return pulumi.get(self, "proposal_id")

    @proposal_id.setter
    def proposal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "proposal_id", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> Optional[pulumi.Input[str]]:
        warnings.warn("""use 'associated_gateway_id' argument instead""", DeprecationWarning)
        pulumi.log.warn("""vpn_gateway_id is deprecated: use 'associated_gateway_id' argument instead""")

        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_gateway_id", value)


class GatewayAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_prefixes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 associated_gateway_id: Optional[pulumi.Input[str]] = None,
                 associated_gateway_owner_account_id: Optional[pulumi.Input[str]] = None,
                 dx_gateway_id: Optional[pulumi.Input[str]] = None,
                 proposal_id: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Associates a Direct Connect Gateway with a VGW or transit gateway.

        To create a cross-account association, create an `directconnect.GatewayAssociationProposal` resource
        in the AWS account that owns the VGW or transit gateway and then accept the proposal in the AWS account that owns the Direct Connect Gateway
        by creating an `directconnect.GatewayAssociation` resource with the `proposal_id` and `associated_gateway_owner_account_id` attributes set.

        ## Example Usage
        ### VPN Gateway Association

        ```python
        import pulumi
        import pulumi_aws as aws

        example_gateway = aws.directconnect.Gateway("exampleGateway", amazon_side_asn="64512")
        example_vpc = aws.ec2.Vpc("exampleVpc", cidr_block="10.255.255.0/28")
        example_vpn_gateway = aws.ec2.VpnGateway("exampleVpnGateway", vpc_id=example_vpc.id)
        example_gateway_association = aws.directconnect.GatewayAssociation("exampleGatewayAssociation",
            dx_gateway_id=example_gateway.id,
            associated_gateway_id=example_vpn_gateway.id)
        ```
        ### Transit Gateway Association

        ```python
        import pulumi
        import pulumi_aws as aws

        example_gateway = aws.directconnect.Gateway("exampleGateway", amazon_side_asn="64512")
        example_transit_gateway = aws.ec2transitgateway.TransitGateway("exampleTransitGateway")
        example_gateway_association = aws.directconnect.GatewayAssociation("exampleGatewayAssociation",
            dx_gateway_id=example_gateway.id,
            associated_gateway_id=example_transit_gateway.id,
            allowed_prefixes=[
                "10.255.255.0/30",
                "10.255.255.8/30",
            ])
        ```
        ### Allowed Prefixes

        ```python
        import pulumi
        import pulumi_aws as aws

        example_gateway = aws.directconnect.Gateway("exampleGateway", amazon_side_asn="64512")
        example_vpc = aws.ec2.Vpc("exampleVpc", cidr_block="10.255.255.0/28")
        example_vpn_gateway = aws.ec2.VpnGateway("exampleVpnGateway", vpc_id=example_vpc.id)
        example_gateway_association = aws.directconnect.GatewayAssociation("exampleGatewayAssociation",
            dx_gateway_id=example_gateway.id,
            associated_gateway_id=example_vpn_gateway.id,
            allowed_prefixes=[
                "210.52.109.0/24",
                "175.45.176.0/22",
            ])
        ```

        ## Import

        Using `pulumi import`, import Direct Connect gateway associations using `dx_gateway_id` together with `associated_gateway_id`. For example:

        ```sh
         $ pulumi import aws:directconnect/gatewayAssociation:GatewayAssociation example 345508c3-7215-4aef-9832-07c125d5bd0f/vgw-98765432
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_prefixes: VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
        :param pulumi.Input[str] associated_gateway_id: The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
               Used for single account Direct Connect gateway associations.
        :param pulumi.Input[str] associated_gateway_owner_account_id: The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
               Used for cross-account Direct Connect gateway associations.
        :param pulumi.Input[str] dx_gateway_id: The ID of the Direct Connect gateway.
        :param pulumi.Input[str] proposal_id: The ID of the Direct Connect gateway association proposal.
               Used for cross-account Direct Connect gateway associations.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Associates a Direct Connect Gateway with a VGW or transit gateway.

        To create a cross-account association, create an `directconnect.GatewayAssociationProposal` resource
        in the AWS account that owns the VGW or transit gateway and then accept the proposal in the AWS account that owns the Direct Connect Gateway
        by creating an `directconnect.GatewayAssociation` resource with the `proposal_id` and `associated_gateway_owner_account_id` attributes set.

        ## Example Usage
        ### VPN Gateway Association

        ```python
        import pulumi
        import pulumi_aws as aws

        example_gateway = aws.directconnect.Gateway("exampleGateway", amazon_side_asn="64512")
        example_vpc = aws.ec2.Vpc("exampleVpc", cidr_block="10.255.255.0/28")
        example_vpn_gateway = aws.ec2.VpnGateway("exampleVpnGateway", vpc_id=example_vpc.id)
        example_gateway_association = aws.directconnect.GatewayAssociation("exampleGatewayAssociation",
            dx_gateway_id=example_gateway.id,
            associated_gateway_id=example_vpn_gateway.id)
        ```
        ### Transit Gateway Association

        ```python
        import pulumi
        import pulumi_aws as aws

        example_gateway = aws.directconnect.Gateway("exampleGateway", amazon_side_asn="64512")
        example_transit_gateway = aws.ec2transitgateway.TransitGateway("exampleTransitGateway")
        example_gateway_association = aws.directconnect.GatewayAssociation("exampleGatewayAssociation",
            dx_gateway_id=example_gateway.id,
            associated_gateway_id=example_transit_gateway.id,
            allowed_prefixes=[
                "10.255.255.0/30",
                "10.255.255.8/30",
            ])
        ```
        ### Allowed Prefixes

        ```python
        import pulumi
        import pulumi_aws as aws

        example_gateway = aws.directconnect.Gateway("exampleGateway", amazon_side_asn="64512")
        example_vpc = aws.ec2.Vpc("exampleVpc", cidr_block="10.255.255.0/28")
        example_vpn_gateway = aws.ec2.VpnGateway("exampleVpnGateway", vpc_id=example_vpc.id)
        example_gateway_association = aws.directconnect.GatewayAssociation("exampleGatewayAssociation",
            dx_gateway_id=example_gateway.id,
            associated_gateway_id=example_vpn_gateway.id,
            allowed_prefixes=[
                "210.52.109.0/24",
                "175.45.176.0/22",
            ])
        ```

        ## Import

        Using `pulumi import`, import Direct Connect gateway associations using `dx_gateway_id` together with `associated_gateway_id`. For example:

        ```sh
         $ pulumi import aws:directconnect/gatewayAssociation:GatewayAssociation example 345508c3-7215-4aef-9832-07c125d5bd0f/vgw-98765432
        ```

        :param str resource_name: The name of the resource.
        :param GatewayAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_prefixes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 associated_gateway_id: Optional[pulumi.Input[str]] = None,
                 associated_gateway_owner_account_id: Optional[pulumi.Input[str]] = None,
                 dx_gateway_id: Optional[pulumi.Input[str]] = None,
                 proposal_id: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewayAssociationArgs.__new__(GatewayAssociationArgs)

            __props__.__dict__["allowed_prefixes"] = allowed_prefixes
            __props__.__dict__["associated_gateway_id"] = associated_gateway_id
            __props__.__dict__["associated_gateway_owner_account_id"] = associated_gateway_owner_account_id
            if dx_gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'dx_gateway_id'")
            __props__.__dict__["dx_gateway_id"] = dx_gateway_id
            __props__.__dict__["proposal_id"] = proposal_id
            if vpn_gateway_id is not None and not opts.urn:
                warnings.warn("""use 'associated_gateway_id' argument instead""", DeprecationWarning)
                pulumi.log.warn("""vpn_gateway_id is deprecated: use 'associated_gateway_id' argument instead""")
            __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
            __props__.__dict__["associated_gateway_type"] = None
            __props__.__dict__["dx_gateway_association_id"] = None
            __props__.__dict__["dx_gateway_owner_account_id"] = None
        super(GatewayAssociation, __self__).__init__(
            'aws:directconnect/gatewayAssociation:GatewayAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_prefixes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            associated_gateway_id: Optional[pulumi.Input[str]] = None,
            associated_gateway_owner_account_id: Optional[pulumi.Input[str]] = None,
            associated_gateway_type: Optional[pulumi.Input[str]] = None,
            dx_gateway_association_id: Optional[pulumi.Input[str]] = None,
            dx_gateway_id: Optional[pulumi.Input[str]] = None,
            dx_gateway_owner_account_id: Optional[pulumi.Input[str]] = None,
            proposal_id: Optional[pulumi.Input[str]] = None,
            vpn_gateway_id: Optional[pulumi.Input[str]] = None) -> 'GatewayAssociation':
        """
        Get an existing GatewayAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_prefixes: VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
        :param pulumi.Input[str] associated_gateway_id: The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
               Used for single account Direct Connect gateway associations.
        :param pulumi.Input[str] associated_gateway_owner_account_id: The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
               Used for cross-account Direct Connect gateway associations.
        :param pulumi.Input[str] associated_gateway_type: The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
        :param pulumi.Input[str] dx_gateway_association_id: The ID of the Direct Connect gateway association.
        :param pulumi.Input[str] dx_gateway_id: The ID of the Direct Connect gateway.
        :param pulumi.Input[str] dx_gateway_owner_account_id: The ID of the AWS account that owns the Direct Connect gateway.
        :param pulumi.Input[str] proposal_id: The ID of the Direct Connect gateway association proposal.
               Used for cross-account Direct Connect gateway associations.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewayAssociationState.__new__(_GatewayAssociationState)

        __props__.__dict__["allowed_prefixes"] = allowed_prefixes
        __props__.__dict__["associated_gateway_id"] = associated_gateway_id
        __props__.__dict__["associated_gateway_owner_account_id"] = associated_gateway_owner_account_id
        __props__.__dict__["associated_gateway_type"] = associated_gateway_type
        __props__.__dict__["dx_gateway_association_id"] = dx_gateway_association_id
        __props__.__dict__["dx_gateway_id"] = dx_gateway_id
        __props__.__dict__["dx_gateway_owner_account_id"] = dx_gateway_owner_account_id
        __props__.__dict__["proposal_id"] = proposal_id
        __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
        return GatewayAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowedPrefixes")
    def allowed_prefixes(self) -> pulumi.Output[Sequence[str]]:
        """
        VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
        """
        return pulumi.get(self, "allowed_prefixes")

    @property
    @pulumi.getter(name="associatedGatewayId")
    def associated_gateway_id(self) -> pulumi.Output[str]:
        """
        The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
        Used for single account Direct Connect gateway associations.
        """
        return pulumi.get(self, "associated_gateway_id")

    @property
    @pulumi.getter(name="associatedGatewayOwnerAccountId")
    def associated_gateway_owner_account_id(self) -> pulumi.Output[str]:
        """
        The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
        Used for cross-account Direct Connect gateway associations.
        """
        return pulumi.get(self, "associated_gateway_owner_account_id")

    @property
    @pulumi.getter(name="associatedGatewayType")
    def associated_gateway_type(self) -> pulumi.Output[str]:
        """
        The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
        """
        return pulumi.get(self, "associated_gateway_type")

    @property
    @pulumi.getter(name="dxGatewayAssociationId")
    def dx_gateway_association_id(self) -> pulumi.Output[str]:
        """
        The ID of the Direct Connect gateway association.
        """
        return pulumi.get(self, "dx_gateway_association_id")

    @property
    @pulumi.getter(name="dxGatewayId")
    def dx_gateway_id(self) -> pulumi.Output[str]:
        """
        The ID of the Direct Connect gateway.
        """
        return pulumi.get(self, "dx_gateway_id")

    @property
    @pulumi.getter(name="dxGatewayOwnerAccountId")
    def dx_gateway_owner_account_id(self) -> pulumi.Output[str]:
        """
        The ID of the AWS account that owns the Direct Connect gateway.
        """
        return pulumi.get(self, "dx_gateway_owner_account_id")

    @property
    @pulumi.getter(name="proposalId")
    def proposal_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the Direct Connect gateway association proposal.
        Used for cross-account Direct Connect gateway associations.
        """
        return pulumi.get(self, "proposal_id")

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Output[Optional[str]]:
        warnings.warn("""use 'associated_gateway_id' argument instead""", DeprecationWarning)
        pulumi.log.warn("""vpn_gateway_id is deprecated: use 'associated_gateway_id' argument instead""")

        return pulumi.get(self, "vpn_gateway_id")

