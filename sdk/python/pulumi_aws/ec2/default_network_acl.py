# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DefaultNetworkAclArgs', 'DefaultNetworkAcl']

@pulumi.input_type
class DefaultNetworkAclArgs:
    def __init__(__self__, *,
                 default_network_acl_id: pulumi.Input[str],
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclEgressArgs']]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclIngressArgs']]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a DefaultNetworkAcl resource.
        :param pulumi.Input[str] default_network_acl_id: Network ACL ID to manage. This attribute is exported from `ec2.Vpc`, or manually found via the AWS Console.
        :param pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclEgressArgs']]] egress: Configuration block for an egress rule. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclIngressArgs']]] ingress: Configuration block for an ingress rule. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource.
        """
        pulumi.set(__self__, "default_network_acl_id", default_network_acl_id)
        if egress is not None:
            pulumi.set(__self__, "egress", egress)
        if ingress is not None:
            pulumi.set(__self__, "ingress", ingress)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="defaultNetworkAclId")
    def default_network_acl_id(self) -> pulumi.Input[str]:
        """
        Network ACL ID to manage. This attribute is exported from `ec2.Vpc`, or manually found via the AWS Console.
        """
        return pulumi.get(self, "default_network_acl_id")

    @default_network_acl_id.setter
    def default_network_acl_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "default_network_acl_id", value)

    @property
    @pulumi.getter
    def egress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclEgressArgs']]]]:
        """
        Configuration block for an egress rule. Detailed below.
        """
        return pulumi.get(self, "egress")

    @egress.setter
    def egress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclEgressArgs']]]]):
        pulumi.set(self, "egress", value)

    @property
    @pulumi.getter
    def ingress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclIngressArgs']]]]:
        """
        Configuration block for an ingress rule. Detailed below.
        """
        return pulumi.get(self, "ingress")

    @ingress.setter
    def ingress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclIngressArgs']]]]):
        pulumi.set(self, "ingress", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DefaultNetworkAclState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 default_network_acl_id: Optional[pulumi.Input[str]] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclEgressArgs']]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclIngressArgs']]]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DefaultNetworkAcl resources.
        :param pulumi.Input[str] arn: ARN of the Default Network ACL
        :param pulumi.Input[str] default_network_acl_id: Network ACL ID to manage. This attribute is exported from `ec2.Vpc`, or manually found via the AWS Console.
        :param pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclEgressArgs']]] egress: Configuration block for an egress rule. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclIngressArgs']]] ingress: Configuration block for an ingress rule. Detailed below.
        :param pulumi.Input[str] owner_id: ID of the AWS account that owns the Default Network ACL
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: ID of the associated VPC
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if default_network_acl_id is not None:
            pulumi.set(__self__, "default_network_acl_id", default_network_acl_id)
        if egress is not None:
            pulumi.set(__self__, "egress", egress)
        if ingress is not None:
            pulumi.set(__self__, "ingress", ingress)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the Default Network ACL
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="defaultNetworkAclId")
    def default_network_acl_id(self) -> Optional[pulumi.Input[str]]:
        """
        Network ACL ID to manage. This attribute is exported from `ec2.Vpc`, or manually found via the AWS Console.
        """
        return pulumi.get(self, "default_network_acl_id")

    @default_network_acl_id.setter
    def default_network_acl_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_network_acl_id", value)

    @property
    @pulumi.getter
    def egress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclEgressArgs']]]]:
        """
        Configuration block for an egress rule. Detailed below.
        """
        return pulumi.get(self, "egress")

    @egress.setter
    def egress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclEgressArgs']]]]):
        pulumi.set(self, "egress", value)

    @property
    @pulumi.getter
    def ingress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclIngressArgs']]]]:
        """
        Configuration block for an ingress rule. Detailed below.
        """
        return pulumi.get(self, "ingress")

    @ingress.setter
    def ingress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DefaultNetworkAclIngressArgs']]]]):
        pulumi.set(self, "ingress", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the AWS account that owns the Default Network ACL
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the associated VPC
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class DefaultNetworkAcl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_network_acl_id: Optional[pulumi.Input[str]] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclEgressArgs']]]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclIngressArgs']]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage a VPC's default network ACL. This resource can manage the default network ACL of the default or a non-default VPC.

        > **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `ec2.DefaultNetworkAcl` behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to "adopt" it into management.

        Every VPC has a default network ACL that can be managed but not destroyed. When the provider first adopts the Default Network ACL, it **immediately removes all rules in the ACL**. It then proceeds to create any rules specified in the configuration. This step is required so that only the rules specified in the configuration are created.

        This resource treats its inline rules as absolute; only the rules defined inline are created, and any additions/removals external to this resource will result in diffs being shown. For these reasons, this resource is incompatible with the `ec2.NetworkAclRule` resource.

        For more information about Network ACLs, see the AWS Documentation on [Network ACLs][aws-network-acls].

        ## Example Usage
        ### Basic Example

        The following config gives the Default Network ACL the same rules that AWS includes but pulls the resource under management by this provider. This means that any ACL rules added or changed will be detected as drift.

        ```python
        import pulumi
        import pulumi_aws as aws

        mainvpc = aws.ec2.Vpc("mainvpc", cidr_block="10.1.0.0/16")
        default = aws.ec2.DefaultNetworkAcl("default",
            default_network_acl_id=mainvpc.default_network_acl_id,
            ingress=[aws.ec2.DefaultNetworkAclIngressArgs(
                protocol="-1",
                rule_no=100,
                action="allow",
                cidr_block=mainvpc.cidr_block,
                from_port=0,
                to_port=0,
            )],
            egress=[aws.ec2.DefaultNetworkAclEgressArgs(
                protocol="-1",
                rule_no=100,
                action="allow",
                cidr_block="0.0.0.0/0",
                from_port=0,
                to_port=0,
            )])
        ```
        ### Example: Deny All Egress Traffic, Allow Ingress

        The following denies all Egress traffic by omitting any `egress` rules, while including the default `ingress` rule to allow all traffic.

        ```python
        import pulumi
        import pulumi_aws as aws

        mainvpc = aws.ec2.Vpc("mainvpc", cidr_block="10.1.0.0/16")
        default = aws.ec2.DefaultNetworkAcl("default",
            default_network_acl_id=mainvpc.default_network_acl_id,
            ingress=[aws.ec2.DefaultNetworkAclIngressArgs(
                protocol="-1",
                rule_no=100,
                action="allow",
                cidr_block=aws_default_vpc["mainvpc"]["cidr_block"],
                from_port=0,
                to_port=0,
            )])
        ```
        ### Example: Deny All Traffic To Any Subnet In The Default Network ACL

        This config denies all traffic in the Default ACL. This can be useful if you want to lock down the VPC to force all resources to assign a non-default ACL.

        ```python
        import pulumi
        import pulumi_aws as aws

        mainvpc = aws.ec2.Vpc("mainvpc", cidr_block="10.1.0.0/16")
        default = aws.ec2.DefaultNetworkAcl("default", default_network_acl_id=mainvpc.default_network_acl_id)
        # no rules defined, deny all traffic in this ACL
        ```
        ### Managing Subnets In A Default Network ACL

        Within a VPC, all Subnets must be associated with a Network ACL. In order to "delete" the association between a Subnet and a non-default Network ACL, the association is destroyed by replacing it with an association between the Subnet and the Default ACL instead.

        When managing the Default Network ACL, you cannot "remove" Subnets. Instead, they must be reassigned to another Network ACL, or the Subnet itself must be destroyed. Because of these requirements, removing the `subnet_ids` attribute from the configuration of a `ec2.DefaultNetworkAcl` resource may result in a reoccurring plan, until the Subnets are reassigned to another Network ACL or are destroyed.

        Because Subnets are by default associated with the Default Network ACL, any non-explicit association will show up as a plan to remove the Subnet. For example: if you have a custom `ec2.NetworkAcl` with two subnets attached, and you remove the `ec2.NetworkAcl` resource, after successfully destroying this resource future plans will show a diff on the managed `ec2.DefaultNetworkAcl`, as those two Subnets have been orphaned by the now destroyed network acl and thus adopted by the Default Network ACL. In order to avoid a reoccurring plan, they will need to be reassigned, destroyed, or added to the `subnet_ids` attribute of the `ec2.DefaultNetworkAcl` entry.

        As an alternative to the above, you can also specify the following lifecycle configuration in your `ec2.DefaultNetworkAcl` resource:

        ```python
        import pulumi
        import pulumi_aws as aws

        # ... other configuration ...
        default = aws.ec2.DefaultNetworkAcl("default")
        ```
        ### Removing `ec2.DefaultNetworkAcl` From Your Configuration

        Each AWS VPC comes with a Default Network ACL that cannot be deleted. The `ec2.DefaultNetworkAcl` allows you to manage this Network ACL, but the provider cannot destroy it. Removing this resource from your configuration will remove it from your statefile and management, **but will not destroy the Network ACL.** All Subnets associations and ingress or egress rules will be left as they are at the time of removal. You can resume managing them via the AWS Console.

        ## Import

        Default Network ACLs can be imported using the `id`, e.g.

        ```sh
         $ pulumi import aws:ec2/defaultNetworkAcl:DefaultNetworkAcl sample acl-7aaabd18
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_network_acl_id: Network ACL ID to manage. This attribute is exported from `ec2.Vpc`, or manually found via the AWS Console.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclEgressArgs']]]] egress: Configuration block for an egress rule. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclIngressArgs']]]] ingress: Configuration block for an ingress rule. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DefaultNetworkAclArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage a VPC's default network ACL. This resource can manage the default network ACL of the default or a non-default VPC.

        > **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `ec2.DefaultNetworkAcl` behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to "adopt" it into management.

        Every VPC has a default network ACL that can be managed but not destroyed. When the provider first adopts the Default Network ACL, it **immediately removes all rules in the ACL**. It then proceeds to create any rules specified in the configuration. This step is required so that only the rules specified in the configuration are created.

        This resource treats its inline rules as absolute; only the rules defined inline are created, and any additions/removals external to this resource will result in diffs being shown. For these reasons, this resource is incompatible with the `ec2.NetworkAclRule` resource.

        For more information about Network ACLs, see the AWS Documentation on [Network ACLs][aws-network-acls].

        ## Example Usage
        ### Basic Example

        The following config gives the Default Network ACL the same rules that AWS includes but pulls the resource under management by this provider. This means that any ACL rules added or changed will be detected as drift.

        ```python
        import pulumi
        import pulumi_aws as aws

        mainvpc = aws.ec2.Vpc("mainvpc", cidr_block="10.1.0.0/16")
        default = aws.ec2.DefaultNetworkAcl("default",
            default_network_acl_id=mainvpc.default_network_acl_id,
            ingress=[aws.ec2.DefaultNetworkAclIngressArgs(
                protocol="-1",
                rule_no=100,
                action="allow",
                cidr_block=mainvpc.cidr_block,
                from_port=0,
                to_port=0,
            )],
            egress=[aws.ec2.DefaultNetworkAclEgressArgs(
                protocol="-1",
                rule_no=100,
                action="allow",
                cidr_block="0.0.0.0/0",
                from_port=0,
                to_port=0,
            )])
        ```
        ### Example: Deny All Egress Traffic, Allow Ingress

        The following denies all Egress traffic by omitting any `egress` rules, while including the default `ingress` rule to allow all traffic.

        ```python
        import pulumi
        import pulumi_aws as aws

        mainvpc = aws.ec2.Vpc("mainvpc", cidr_block="10.1.0.0/16")
        default = aws.ec2.DefaultNetworkAcl("default",
            default_network_acl_id=mainvpc.default_network_acl_id,
            ingress=[aws.ec2.DefaultNetworkAclIngressArgs(
                protocol="-1",
                rule_no=100,
                action="allow",
                cidr_block=aws_default_vpc["mainvpc"]["cidr_block"],
                from_port=0,
                to_port=0,
            )])
        ```
        ### Example: Deny All Traffic To Any Subnet In The Default Network ACL

        This config denies all traffic in the Default ACL. This can be useful if you want to lock down the VPC to force all resources to assign a non-default ACL.

        ```python
        import pulumi
        import pulumi_aws as aws

        mainvpc = aws.ec2.Vpc("mainvpc", cidr_block="10.1.0.0/16")
        default = aws.ec2.DefaultNetworkAcl("default", default_network_acl_id=mainvpc.default_network_acl_id)
        # no rules defined, deny all traffic in this ACL
        ```
        ### Managing Subnets In A Default Network ACL

        Within a VPC, all Subnets must be associated with a Network ACL. In order to "delete" the association between a Subnet and a non-default Network ACL, the association is destroyed by replacing it with an association between the Subnet and the Default ACL instead.

        When managing the Default Network ACL, you cannot "remove" Subnets. Instead, they must be reassigned to another Network ACL, or the Subnet itself must be destroyed. Because of these requirements, removing the `subnet_ids` attribute from the configuration of a `ec2.DefaultNetworkAcl` resource may result in a reoccurring plan, until the Subnets are reassigned to another Network ACL or are destroyed.

        Because Subnets are by default associated with the Default Network ACL, any non-explicit association will show up as a plan to remove the Subnet. For example: if you have a custom `ec2.NetworkAcl` with two subnets attached, and you remove the `ec2.NetworkAcl` resource, after successfully destroying this resource future plans will show a diff on the managed `ec2.DefaultNetworkAcl`, as those two Subnets have been orphaned by the now destroyed network acl and thus adopted by the Default Network ACL. In order to avoid a reoccurring plan, they will need to be reassigned, destroyed, or added to the `subnet_ids` attribute of the `ec2.DefaultNetworkAcl` entry.

        As an alternative to the above, you can also specify the following lifecycle configuration in your `ec2.DefaultNetworkAcl` resource:

        ```python
        import pulumi
        import pulumi_aws as aws

        # ... other configuration ...
        default = aws.ec2.DefaultNetworkAcl("default")
        ```
        ### Removing `ec2.DefaultNetworkAcl` From Your Configuration

        Each AWS VPC comes with a Default Network ACL that cannot be deleted. The `ec2.DefaultNetworkAcl` allows you to manage this Network ACL, but the provider cannot destroy it. Removing this resource from your configuration will remove it from your statefile and management, **but will not destroy the Network ACL.** All Subnets associations and ingress or egress rules will be left as they are at the time of removal. You can resume managing them via the AWS Console.

        ## Import

        Default Network ACLs can be imported using the `id`, e.g.

        ```sh
         $ pulumi import aws:ec2/defaultNetworkAcl:DefaultNetworkAcl sample acl-7aaabd18
        ```

        :param str resource_name: The name of the resource.
        :param DefaultNetworkAclArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DefaultNetworkAclArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_network_acl_id: Optional[pulumi.Input[str]] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclEgressArgs']]]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclIngressArgs']]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
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
            __props__ = DefaultNetworkAclArgs.__new__(DefaultNetworkAclArgs)

            if default_network_acl_id is None and not opts.urn:
                raise TypeError("Missing required property 'default_network_acl_id'")
            __props__.__dict__["default_network_acl_id"] = default_network_acl_id
            __props__.__dict__["egress"] = egress
            __props__.__dict__["ingress"] = ingress
            __props__.__dict__["subnet_ids"] = subnet_ids
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner_id"] = None
            __props__.__dict__["vpc_id"] = None
        super(DefaultNetworkAcl, __self__).__init__(
            'aws:ec2/defaultNetworkAcl:DefaultNetworkAcl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            default_network_acl_id: Optional[pulumi.Input[str]] = None,
            egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclEgressArgs']]]]] = None,
            ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclIngressArgs']]]]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'DefaultNetworkAcl':
        """
        Get an existing DefaultNetworkAcl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the Default Network ACL
        :param pulumi.Input[str] default_network_acl_id: Network ACL ID to manage. This attribute is exported from `ec2.Vpc`, or manually found via the AWS Console.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclEgressArgs']]]] egress: Configuration block for an egress rule. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DefaultNetworkAclIngressArgs']]]] ingress: Configuration block for an ingress rule. Detailed below.
        :param pulumi.Input[str] owner_id: ID of the AWS account that owns the Default Network ACL
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: ID of the associated VPC
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DefaultNetworkAclState.__new__(_DefaultNetworkAclState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["default_network_acl_id"] = default_network_acl_id
        __props__.__dict__["egress"] = egress
        __props__.__dict__["ingress"] = ingress
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["subnet_ids"] = subnet_ids
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_id"] = vpc_id
        return DefaultNetworkAcl(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the Default Network ACL
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="defaultNetworkAclId")
    def default_network_acl_id(self) -> pulumi.Output[str]:
        """
        Network ACL ID to manage. This attribute is exported from `ec2.Vpc`, or manually found via the AWS Console.
        """
        return pulumi.get(self, "default_network_acl_id")

    @property
    @pulumi.getter
    def egress(self) -> pulumi.Output[Optional[Sequence['outputs.DefaultNetworkAclEgress']]]:
        """
        Configuration block for an egress rule. Detailed below.
        """
        return pulumi.get(self, "egress")

    @property
    @pulumi.getter
    def ingress(self) -> pulumi.Output[Optional[Sequence['outputs.DefaultNetworkAclIngress']]]:
        """
        Configuration block for an ingress rule. Detailed below.
        """
        return pulumi.get(self, "ingress")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        ID of the AWS account that owns the Default Network ACL
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of Subnet IDs to apply the ACL to. See the notes below on managing Subnets in the Default Network ACL
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        ID of the associated VPC
        """
        return pulumi.get(self, "vpc_id")

