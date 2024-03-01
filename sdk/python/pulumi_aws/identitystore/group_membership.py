# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['GroupMembershipArgs', 'GroupMembership']

@pulumi.input_type
class GroupMembershipArgs:
    def __init__(__self__, *,
                 group_id: pulumi.Input[str],
                 identity_store_id: pulumi.Input[str],
                 member_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a GroupMembership resource.
        :param pulumi.Input[str] group_id: The identifier for a group in the Identity Store.
        :param pulumi.Input[str] identity_store_id: Identity Store ID associated with the Single Sign-On Instance.
        :param pulumi.Input[str] member_id: The identifier for a user in the Identity Store.
        """
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "identity_store_id", identity_store_id)
        pulumi.set(__self__, "member_id", member_id)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        The identifier for a group in the Identity Store.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="identityStoreId")
    def identity_store_id(self) -> pulumi.Input[str]:
        """
        Identity Store ID associated with the Single Sign-On Instance.
        """
        return pulumi.get(self, "identity_store_id")

    @identity_store_id.setter
    def identity_store_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "identity_store_id", value)

    @property
    @pulumi.getter(name="memberId")
    def member_id(self) -> pulumi.Input[str]:
        """
        The identifier for a user in the Identity Store.
        """
        return pulumi.get(self, "member_id")

    @member_id.setter
    def member_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "member_id", value)


@pulumi.input_type
class _GroupMembershipState:
    def __init__(__self__, *,
                 group_id: Optional[pulumi.Input[str]] = None,
                 identity_store_id: Optional[pulumi.Input[str]] = None,
                 member_id: Optional[pulumi.Input[str]] = None,
                 membership_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GroupMembership resources.
        :param pulumi.Input[str] group_id: The identifier for a group in the Identity Store.
        :param pulumi.Input[str] identity_store_id: Identity Store ID associated with the Single Sign-On Instance.
        :param pulumi.Input[str] member_id: The identifier for a user in the Identity Store.
        :param pulumi.Input[str] membership_id: The identifier of the newly created group membership in the Identity Store.
        """
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if identity_store_id is not None:
            pulumi.set(__self__, "identity_store_id", identity_store_id)
        if member_id is not None:
            pulumi.set(__self__, "member_id", member_id)
        if membership_id is not None:
            pulumi.set(__self__, "membership_id", membership_id)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for a group in the Identity Store.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="identityStoreId")
    def identity_store_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identity Store ID associated with the Single Sign-On Instance.
        """
        return pulumi.get(self, "identity_store_id")

    @identity_store_id.setter
    def identity_store_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity_store_id", value)

    @property
    @pulumi.getter(name="memberId")
    def member_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for a user in the Identity Store.
        """
        return pulumi.get(self, "member_id")

    @member_id.setter
    def member_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "member_id", value)

    @property
    @pulumi.getter(name="membershipId")
    def membership_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of the newly created group membership in the Identity Store.
        """
        return pulumi.get(self, "membership_id")

    @membership_id.setter
    def membership_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "membership_id", value)


class GroupMembership(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 identity_store_id: Optional[pulumi.Input[str]] = None,
                 member_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS IdentityStore Group Membership.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws


        def not_implemented(msg):
            raise NotImplementedError(msg)

        example = aws.ssoadmin.get_instances()
        example_user = aws.identitystore.User("example",
            identity_store_id=not_implemented("tolist(data.aws_ssoadmin_instances.example.identity_store_ids)")[0],
            display_name="John Doe",
            user_name="john.doe@example.com",
            name=aws.identitystore.UserNameArgs(
                family_name="Doe",
                given_name="John",
            ))
        example_group = aws.identitystore.Group("example",
            identity_store_id=not_implemented("tolist(data.aws_ssoadmin_instances.example.identity_store_ids)")[0],
            display_name="MyGroup",
            description="Some group name")
        example_group_membership = aws.identitystore.GroupMembership("example",
            identity_store_id=not_implemented("tolist(data.aws_ssoadmin_instances.example.identity_store_ids)")[0],
            group_id=example_group.group_id,
            member_id=example_user.user_id)
        ```

        ## Import

        Using `pulumi import`, import `aws_identitystore_group_membership` using the `identity_store_id/membership_id`. For example:

        ```sh
         $ pulumi import aws:identitystore/groupMembership:GroupMembership example d-0000000000/00000000-0000-0000-0000-000000000000
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: The identifier for a group in the Identity Store.
        :param pulumi.Input[str] identity_store_id: Identity Store ID associated with the Single Sign-On Instance.
        :param pulumi.Input[str] member_id: The identifier for a user in the Identity Store.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GroupMembershipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS IdentityStore Group Membership.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws


        def not_implemented(msg):
            raise NotImplementedError(msg)

        example = aws.ssoadmin.get_instances()
        example_user = aws.identitystore.User("example",
            identity_store_id=not_implemented("tolist(data.aws_ssoadmin_instances.example.identity_store_ids)")[0],
            display_name="John Doe",
            user_name="john.doe@example.com",
            name=aws.identitystore.UserNameArgs(
                family_name="Doe",
                given_name="John",
            ))
        example_group = aws.identitystore.Group("example",
            identity_store_id=not_implemented("tolist(data.aws_ssoadmin_instances.example.identity_store_ids)")[0],
            display_name="MyGroup",
            description="Some group name")
        example_group_membership = aws.identitystore.GroupMembership("example",
            identity_store_id=not_implemented("tolist(data.aws_ssoadmin_instances.example.identity_store_ids)")[0],
            group_id=example_group.group_id,
            member_id=example_user.user_id)
        ```

        ## Import

        Using `pulumi import`, import `aws_identitystore_group_membership` using the `identity_store_id/membership_id`. For example:

        ```sh
         $ pulumi import aws:identitystore/groupMembership:GroupMembership example d-0000000000/00000000-0000-0000-0000-000000000000
        ```

        :param str resource_name: The name of the resource.
        :param GroupMembershipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupMembershipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 identity_store_id: Optional[pulumi.Input[str]] = None,
                 member_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupMembershipArgs.__new__(GroupMembershipArgs)

            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            if identity_store_id is None and not opts.urn:
                raise TypeError("Missing required property 'identity_store_id'")
            __props__.__dict__["identity_store_id"] = identity_store_id
            if member_id is None and not opts.urn:
                raise TypeError("Missing required property 'member_id'")
            __props__.__dict__["member_id"] = member_id
            __props__.__dict__["membership_id"] = None
        super(GroupMembership, __self__).__init__(
            'aws:identitystore/groupMembership:GroupMembership',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            identity_store_id: Optional[pulumi.Input[str]] = None,
            member_id: Optional[pulumi.Input[str]] = None,
            membership_id: Optional[pulumi.Input[str]] = None) -> 'GroupMembership':
        """
        Get an existing GroupMembership resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: The identifier for a group in the Identity Store.
        :param pulumi.Input[str] identity_store_id: Identity Store ID associated with the Single Sign-On Instance.
        :param pulumi.Input[str] member_id: The identifier for a user in the Identity Store.
        :param pulumi.Input[str] membership_id: The identifier of the newly created group membership in the Identity Store.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupMembershipState.__new__(_GroupMembershipState)

        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["identity_store_id"] = identity_store_id
        __props__.__dict__["member_id"] = member_id
        __props__.__dict__["membership_id"] = membership_id
        return GroupMembership(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The identifier for a group in the Identity Store.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="identityStoreId")
    def identity_store_id(self) -> pulumi.Output[str]:
        """
        Identity Store ID associated with the Single Sign-On Instance.
        """
        return pulumi.get(self, "identity_store_id")

    @property
    @pulumi.getter(name="memberId")
    def member_id(self) -> pulumi.Output[str]:
        """
        The identifier for a user in the Identity Store.
        """
        return pulumi.get(self, "member_id")

    @property
    @pulumi.getter(name="membershipId")
    def membership_id(self) -> pulumi.Output[str]:
        """
        The identifier of the newly created group membership in the Identity Store.
        """
        return pulumi.get(self, "membership_id")

