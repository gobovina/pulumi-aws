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

__all__ = ['NetworkAclArgs', 'NetworkAcl']

@pulumi.input_type
class NetworkAclArgs:
    def __init__(__self__, *,
                 vpc_id: pulumi.Input[str],
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressArgs']]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressArgs']]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a NetworkAcl resource.
        :param pulumi.Input[str] vpc_id: The ID of the associated VPC.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressArgs']]] egress: Specifies an egress rule. Parameters defined below.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressArgs']]] ingress: Specifies an ingress rule. Parameters defined below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: A list of Subnet IDs to apply the ACL to
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "vpc_id", vpc_id)
        if egress is not None:
            pulumi.set(__self__, "egress", egress)
        if ingress is not None:
            pulumi.set(__self__, "ingress", ingress)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The ID of the associated VPC.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter
    def egress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressArgs']]]]:
        """
        Specifies an egress rule. Parameters defined below.
        """
        return pulumi.get(self, "egress")

    @egress.setter
    def egress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressArgs']]]]):
        pulumi.set(self, "egress", value)

    @property
    @pulumi.getter
    def ingress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressArgs']]]]:
        """
        Specifies an ingress rule. Parameters defined below.
        """
        return pulumi.get(self, "ingress")

    @ingress.setter
    def ingress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressArgs']]]]):
        pulumi.set(self, "ingress", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of Subnet IDs to apply the ACL to
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

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


@pulumi.input_type
class _NetworkAclState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressArgs']]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressArgs']]]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkAcl resources.
        :param pulumi.Input[str] arn: The ARN of the network ACL
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressArgs']]] egress: Specifies an egress rule. Parameters defined below.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressArgs']]] ingress: Specifies an ingress rule. Parameters defined below.
        :param pulumi.Input[str] owner_id: The ID of the AWS account that owns the network ACL.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: A list of Subnet IDs to apply the ACL to
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] vpc_id: The ID of the associated VPC.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
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
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the network ACL
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def egress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressArgs']]]]:
        """
        Specifies an egress rule. Parameters defined below.
        """
        return pulumi.get(self, "egress")

    @egress.setter
    def egress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclEgressArgs']]]]):
        pulumi.set(self, "egress", value)

    @property
    @pulumi.getter
    def ingress(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressArgs']]]]:
        """
        Specifies an ingress rule. Parameters defined below.
        """
        return pulumi.get(self, "ingress")

    @ingress.setter
    def ingress(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkAclIngressArgs']]]]):
        pulumi.set(self, "ingress", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the AWS account that owns the network ACL.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of Subnet IDs to apply the ACL to
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

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
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the associated VPC.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class NetworkAcl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclEgressArgs']]]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclIngressArgs']]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an network ACL resource. You might set up network ACLs with rules similar
        to your security groups in order to add an additional layer of security to your VPC.

        > **NOTE on Network ACLs and Network ACL Rules:** This provider currently
        provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
        defined in-line. At this time you cannot use a Network ACL with in-line rules
        in conjunction with any Network ACL Rule resources. Doing so will cause
        a conflict of rule settings and will overwrite rules.

        > **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association
        resource and a network ACL resource with a `subnet_ids` attribute. Do not use the same subnet ID in both a network ACL
        resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.ec2.NetworkAcl("main",
            vpc_id=aws_vpc["main"]["id"],
            egress=[aws.ec2.NetworkAclEgressArgs(
                protocol="tcp",
                rule_no=200,
                action="allow",
                cidr_block="10.3.0.0/18",
                from_port=443,
                to_port=443,
            )],
            ingress=[aws.ec2.NetworkAclIngressArgs(
                protocol="tcp",
                rule_no=100,
                action="allow",
                cidr_block="10.3.0.0/18",
                from_port=80,
                to_port=80,
            )],
            tags={
                "Name": "main",
            })
        ```

        ## Import

        Using `pulumi import`, import Network ACLs using the `id`. For example:

        ```sh
         $ pulumi import aws:ec2/networkAcl:NetworkAcl main acl-7aaabd18
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclEgressArgs']]]] egress: Specifies an egress rule. Parameters defined below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclIngressArgs']]]] ingress: Specifies an ingress rule. Parameters defined below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: A list of Subnet IDs to apply the ACL to
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] vpc_id: The ID of the associated VPC.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkAclArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an network ACL resource. You might set up network ACLs with rules similar
        to your security groups in order to add an additional layer of security to your VPC.

        > **NOTE on Network ACLs and Network ACL Rules:** This provider currently
        provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
        defined in-line. At this time you cannot use a Network ACL with in-line rules
        in conjunction with any Network ACL Rule resources. Doing so will cause
        a conflict of rule settings and will overwrite rules.

        > **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association
        resource and a network ACL resource with a `subnet_ids` attribute. Do not use the same subnet ID in both a network ACL
        resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.ec2.NetworkAcl("main",
            vpc_id=aws_vpc["main"]["id"],
            egress=[aws.ec2.NetworkAclEgressArgs(
                protocol="tcp",
                rule_no=200,
                action="allow",
                cidr_block="10.3.0.0/18",
                from_port=443,
                to_port=443,
            )],
            ingress=[aws.ec2.NetworkAclIngressArgs(
                protocol="tcp",
                rule_no=100,
                action="allow",
                cidr_block="10.3.0.0/18",
                from_port=80,
                to_port=80,
            )],
            tags={
                "Name": "main",
            })
        ```

        ## Import

        Using `pulumi import`, import Network ACLs using the `id`. For example:

        ```sh
         $ pulumi import aws:ec2/networkAcl:NetworkAcl main acl-7aaabd18
        ```

        :param str resource_name: The name of the resource.
        :param NetworkAclArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkAclArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclEgressArgs']]]]] = None,
                 ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclIngressArgs']]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkAclArgs.__new__(NetworkAclArgs)

            __props__.__dict__["egress"] = egress
            __props__.__dict__["ingress"] = ingress
            __props__.__dict__["subnet_ids"] = subnet_ids
            __props__.__dict__["tags"] = tags
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner_id"] = None
            __props__.__dict__["tags_all"] = None
        super(NetworkAcl, __self__).__init__(
            'aws:ec2/networkAcl:NetworkAcl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            egress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclEgressArgs']]]]] = None,
            ingress: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclIngressArgs']]]]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'NetworkAcl':
        """
        Get an existing NetworkAcl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the network ACL
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclEgressArgs']]]] egress: Specifies an egress rule. Parameters defined below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkAclIngressArgs']]]] ingress: Specifies an ingress rule. Parameters defined below.
        :param pulumi.Input[str] owner_id: The ID of the AWS account that owns the network ACL.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: A list of Subnet IDs to apply the ACL to
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] vpc_id: The ID of the associated VPC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkAclState.__new__(_NetworkAclState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["egress"] = egress
        __props__.__dict__["ingress"] = ingress
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["subnet_ids"] = subnet_ids
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["vpc_id"] = vpc_id
        return NetworkAcl(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the network ACL
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def egress(self) -> pulumi.Output[Sequence['outputs.NetworkAclEgress']]:
        """
        Specifies an egress rule. Parameters defined below.
        """
        return pulumi.get(self, "egress")

    @property
    @pulumi.getter
    def ingress(self) -> pulumi.Output[Sequence['outputs.NetworkAclIngress']]:
        """
        Specifies an ingress rule. Parameters defined below.
        """
        return pulumi.get(self, "ingress")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        The ID of the AWS account that owns the network ACL.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of Subnet IDs to apply the ACL to
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of the associated VPC.
        """
        return pulumi.get(self, "vpc_id")

