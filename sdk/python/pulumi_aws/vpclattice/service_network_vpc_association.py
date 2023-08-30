# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceNetworkVpcAssociationArgs', 'ServiceNetworkVpcAssociation']

@pulumi.input_type
class ServiceNetworkVpcAssociationArgs:
    def __init__(__self__, *,
                 service_network_identifier: pulumi.Input[str],
                 vpc_identifier: pulumi.Input[str],
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ServiceNetworkVpcAssociation resource.
        :param pulumi.Input[str] service_network_identifier: The ID or Amazon Resource Identifier (ARN) of the service network. You must use the ARN if the resources specified in the operation are in different accounts.
               The following arguments are optional:
        :param pulumi.Input[str] vpc_identifier: The ID of the VPC.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The IDs of the security groups.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "service_network_identifier", service_network_identifier)
        pulumi.set(__self__, "vpc_identifier", vpc_identifier)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="serviceNetworkIdentifier")
    def service_network_identifier(self) -> pulumi.Input[str]:
        """
        The ID or Amazon Resource Identifier (ARN) of the service network. You must use the ARN if the resources specified in the operation are in different accounts.
        The following arguments are optional:
        """
        return pulumi.get(self, "service_network_identifier")

    @service_network_identifier.setter
    def service_network_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_network_identifier", value)

    @property
    @pulumi.getter(name="vpcIdentifier")
    def vpc_identifier(self) -> pulumi.Input[str]:
        """
        The ID of the VPC.
        """
        return pulumi.get(self, "vpc_identifier")

    @vpc_identifier.setter
    def vpc_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_identifier", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The IDs of the security groups.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ServiceNetworkVpcAssociationState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 created_by: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_network_identifier: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_identifier: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceNetworkVpcAssociation resources.
        :param pulumi.Input[str] arn: The ARN of the Association.
        :param pulumi.Input[str] created_by: The account that created the association.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The IDs of the security groups.
        :param pulumi.Input[str] service_network_identifier: The ID or Amazon Resource Identifier (ARN) of the service network. You must use the ARN if the resources specified in the operation are in different accounts.
               The following arguments are optional:
        :param pulumi.Input[str] status: The operations status. Valid Values are CREATE_IN_PROGRESS | ACTIVE | DELETE_IN_PROGRESS | CREATE_FAILED | DELETE_FAILED
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] vpc_identifier: The ID of the VPC.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if service_network_identifier is not None:
            pulumi.set(__self__, "service_network_identifier", service_network_identifier)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if vpc_identifier is not None:
            pulumi.set(__self__, "vpc_identifier", vpc_identifier)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the Association.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[str]]:
        """
        The account that created the association.
        """
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_by", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The IDs of the security groups.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="serviceNetworkIdentifier")
    def service_network_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The ID or Amazon Resource Identifier (ARN) of the service network. You must use the ARN if the resources specified in the operation are in different accounts.
        The following arguments are optional:
        """
        return pulumi.get(self, "service_network_identifier")

    @service_network_identifier.setter
    def service_network_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_network_identifier", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The operations status. Valid Values are CREATE_IN_PROGRESS | ACTIVE | DELETE_IN_PROGRESS | CREATE_FAILED | DELETE_FAILED
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="vpcIdentifier")
    def vpc_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC.
        """
        return pulumi.get(self, "vpc_identifier")

    @vpc_identifier.setter
    def vpc_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_identifier", value)


class ServiceNetworkVpcAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_network_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_identifier: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS VPC Lattice Service Network VPC Association.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.ServiceNetworkVpcAssociation("example",
            vpc_identifier=aws_vpc["example"]["id"],
            service_network_identifier=aws_vpclattice_service_network["example"]["id"],
            security_group_ids=[aws_security_group["example"]["id"]])
        ```

        ## Import

        Using `pulumi import`, import VPC Lattice Service Network VPC Association using the `id`. For example:

        ```sh
         $ pulumi import aws:vpclattice/serviceNetworkVpcAssociation:ServiceNetworkVpcAssociation example snsa-05e2474658a88f6ba
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The IDs of the security groups.
        :param pulumi.Input[str] service_network_identifier: The ID or Amazon Resource Identifier (ARN) of the service network. You must use the ARN if the resources specified in the operation are in different accounts.
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] vpc_identifier: The ID of the VPC.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceNetworkVpcAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS VPC Lattice Service Network VPC Association.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.ServiceNetworkVpcAssociation("example",
            vpc_identifier=aws_vpc["example"]["id"],
            service_network_identifier=aws_vpclattice_service_network["example"]["id"],
            security_group_ids=[aws_security_group["example"]["id"]])
        ```

        ## Import

        Using `pulumi import`, import VPC Lattice Service Network VPC Association using the `id`. For example:

        ```sh
         $ pulumi import aws:vpclattice/serviceNetworkVpcAssociation:ServiceNetworkVpcAssociation example snsa-05e2474658a88f6ba
        ```

        :param str resource_name: The name of the resource.
        :param ServiceNetworkVpcAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceNetworkVpcAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_network_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_identifier: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceNetworkVpcAssociationArgs.__new__(ServiceNetworkVpcAssociationArgs)

            __props__.__dict__["security_group_ids"] = security_group_ids
            if service_network_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'service_network_identifier'")
            __props__.__dict__["service_network_identifier"] = service_network_identifier
            __props__.__dict__["tags"] = tags
            if vpc_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_identifier'")
            __props__.__dict__["vpc_identifier"] = vpc_identifier
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_by"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["tags_all"] = None
        super(ServiceNetworkVpcAssociation, __self__).__init__(
            'aws:vpclattice/serviceNetworkVpcAssociation:ServiceNetworkVpcAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            created_by: Optional[pulumi.Input[str]] = None,
            security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            service_network_identifier: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_identifier: Optional[pulumi.Input[str]] = None) -> 'ServiceNetworkVpcAssociation':
        """
        Get an existing ServiceNetworkVpcAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the Association.
        :param pulumi.Input[str] created_by: The account that created the association.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The IDs of the security groups.
        :param pulumi.Input[str] service_network_identifier: The ID or Amazon Resource Identifier (ARN) of the service network. You must use the ARN if the resources specified in the operation are in different accounts.
               The following arguments are optional:
        :param pulumi.Input[str] status: The operations status. Valid Values are CREATE_IN_PROGRESS | ACTIVE | DELETE_IN_PROGRESS | CREATE_FAILED | DELETE_FAILED
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] vpc_identifier: The ID of the VPC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceNetworkVpcAssociationState.__new__(_ServiceNetworkVpcAssociationState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["created_by"] = created_by
        __props__.__dict__["security_group_ids"] = security_group_ids
        __props__.__dict__["service_network_identifier"] = service_network_identifier
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["vpc_identifier"] = vpc_identifier
        return ServiceNetworkVpcAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the Association.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[str]:
        """
        The account that created the association.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The IDs of the security groups.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="serviceNetworkIdentifier")
    def service_network_identifier(self) -> pulumi.Output[str]:
        """
        The ID or Amazon Resource Identifier (ARN) of the service network. You must use the ARN if the resources specified in the operation are in different accounts.
        The following arguments are optional:
        """
        return pulumi.get(self, "service_network_identifier")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The operations status. Valid Values are CREATE_IN_PROGRESS | ACTIVE | DELETE_IN_PROGRESS | CREATE_FAILED | DELETE_FAILED
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="vpcIdentifier")
    def vpc_identifier(self) -> pulumi.Output[str]:
        """
        The ID of the VPC.
        """
        return pulumi.get(self, "vpc_identifier")

