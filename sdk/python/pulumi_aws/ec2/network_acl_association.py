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

__all__ = ['NetworkAclAssociationArgs', 'NetworkAclAssociation']

@pulumi.input_type
class NetworkAclAssociationArgs:
    def __init__(__self__, *,
                 network_acl_id: pulumi.Input[str],
                 subnet_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a NetworkAclAssociation resource.
        :param pulumi.Input[str] network_acl_id: The ID of the network ACL.
        :param pulumi.Input[str] subnet_id: The ID of the associated Subnet.
        """
        pulumi.set(__self__, "network_acl_id", network_acl_id)
        pulumi.set(__self__, "subnet_id", subnet_id)

    @property
    @pulumi.getter(name="networkAclId")
    def network_acl_id(self) -> pulumi.Input[str]:
        """
        The ID of the network ACL.
        """
        return pulumi.get(self, "network_acl_id")

    @network_acl_id.setter
    def network_acl_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_acl_id", value)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Input[str]:
        """
        The ID of the associated Subnet.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subnet_id", value)


@pulumi.input_type
class _NetworkAclAssociationState:
    def __init__(__self__, *,
                 network_acl_id: Optional[pulumi.Input[str]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkAclAssociation resources.
        :param pulumi.Input[str] network_acl_id: The ID of the network ACL.
        :param pulumi.Input[str] subnet_id: The ID of the associated Subnet.
        """
        if network_acl_id is not None:
            pulumi.set(__self__, "network_acl_id", network_acl_id)
        if subnet_id is not None:
            pulumi.set(__self__, "subnet_id", subnet_id)

    @property
    @pulumi.getter(name="networkAclId")
    def network_acl_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the network ACL.
        """
        return pulumi.get(self, "network_acl_id")

    @network_acl_id.setter
    def network_acl_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_acl_id", value)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the associated Subnet.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_id", value)


class NetworkAclAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_acl_id: Optional[pulumi.Input[str]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an network ACL association resource which allows you to associate your network ACL with any subnet(s).

        > **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association resource
        and a network ACL resource with a `subnet_ids` attribute. Do not use the same subnet ID in both a network ACL
        resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.ec2.NetworkAclAssociation("main",
            network_acl_id=main_aws_network_acl["id"],
            subnet_id=main_aws_subnet["id"])
        ```

        ## Import

        Using `pulumi import`, import Network ACL associations using the `id`. For example:

        ```sh
        $ pulumi import aws:ec2/networkAclAssociation:NetworkAclAssociation main aclassoc-02baf37f20966b3e6
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_acl_id: The ID of the network ACL.
        :param pulumi.Input[str] subnet_id: The ID of the associated Subnet.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkAclAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an network ACL association resource which allows you to associate your network ACL with any subnet(s).

        > **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association resource
        and a network ACL resource with a `subnet_ids` attribute. Do not use the same subnet ID in both a network ACL
        resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.ec2.NetworkAclAssociation("main",
            network_acl_id=main_aws_network_acl["id"],
            subnet_id=main_aws_subnet["id"])
        ```

        ## Import

        Using `pulumi import`, import Network ACL associations using the `id`. For example:

        ```sh
        $ pulumi import aws:ec2/networkAclAssociation:NetworkAclAssociation main aclassoc-02baf37f20966b3e6
        ```

        :param str resource_name: The name of the resource.
        :param NetworkAclAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkAclAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_acl_id: Optional[pulumi.Input[str]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkAclAssociationArgs.__new__(NetworkAclAssociationArgs)

            if network_acl_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_acl_id'")
            __props__.__dict__["network_acl_id"] = network_acl_id
            if subnet_id is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_id'")
            __props__.__dict__["subnet_id"] = subnet_id
        super(NetworkAclAssociation, __self__).__init__(
            'aws:ec2/networkAclAssociation:NetworkAclAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            network_acl_id: Optional[pulumi.Input[str]] = None,
            subnet_id: Optional[pulumi.Input[str]] = None) -> 'NetworkAclAssociation':
        """
        Get an existing NetworkAclAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_acl_id: The ID of the network ACL.
        :param pulumi.Input[str] subnet_id: The ID of the associated Subnet.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkAclAssociationState.__new__(_NetworkAclAssociationState)

        __props__.__dict__["network_acl_id"] = network_acl_id
        __props__.__dict__["subnet_id"] = subnet_id
        return NetworkAclAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="networkAclId")
    def network_acl_id(self) -> pulumi.Output[str]:
        """
        The ID of the network ACL.
        """
        return pulumi.get(self, "network_acl_id")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Output[str]:
        """
        The ID of the associated Subnet.
        """
        return pulumi.get(self, "subnet_id")

