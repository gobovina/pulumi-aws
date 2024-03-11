# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RoleAssociationArgs', 'RoleAssociation']

@pulumi.input_type
class RoleAssociationArgs:
    def __init__(__self__, *,
                 role: pulumi.Input[str],
                 workspace_id: pulumi.Input[str],
                 group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a RoleAssociation resource.
        :param pulumi.Input[str] role: The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        :param pulumi.Input[str] workspace_id: The workspace id.
               
               The following arguments are optional:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] group_ids: The AWS SSO group ids to be assigned the role given in `role`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_ids: The AWS SSO user ids to be assigned the role given in `role`.
        """
        pulumi.set(__self__, "role", role)
        pulumi.set(__self__, "workspace_id", workspace_id)
        if group_ids is not None:
            pulumi.set(__self__, "group_ids", group_ids)
        if user_ids is not None:
            pulumi.set(__self__, "user_ids", user_ids)

    @property
    @pulumi.getter
    def role(self) -> pulumi.Input[str]:
        """
        The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[str]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Input[str]:
        """
        The workspace id.

        The following arguments are optional:
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workspace_id", value)

    @property
    @pulumi.getter(name="groupIds")
    def group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The AWS SSO group ids to be assigned the role given in `role`.
        """
        return pulumi.get(self, "group_ids")

    @group_ids.setter
    def group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "group_ids", value)

    @property
    @pulumi.getter(name="userIds")
    def user_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The AWS SSO user ids to be assigned the role given in `role`.
        """
        return pulumi.get(self, "user_ids")

    @user_ids.setter
    def user_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "user_ids", value)


@pulumi.input_type
class _RoleAssociationState:
    def __init__(__self__, *,
                 group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RoleAssociation resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] group_ids: The AWS SSO group ids to be assigned the role given in `role`.
        :param pulumi.Input[str] role: The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_ids: The AWS SSO user ids to be assigned the role given in `role`.
        :param pulumi.Input[str] workspace_id: The workspace id.
               
               The following arguments are optional:
        """
        if group_ids is not None:
            pulumi.set(__self__, "group_ids", group_ids)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if user_ids is not None:
            pulumi.set(__self__, "user_ids", user_ids)
        if workspace_id is not None:
            pulumi.set(__self__, "workspace_id", workspace_id)

    @property
    @pulumi.getter(name="groupIds")
    def group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The AWS SSO group ids to be assigned the role given in `role`.
        """
        return pulumi.get(self, "group_ids")

    @group_ids.setter
    def group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "group_ids", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="userIds")
    def user_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The AWS SSO user ids to be assigned the role given in `role`.
        """
        return pulumi.get(self, "user_ids")

    @user_ids.setter
    def user_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "user_ids", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The workspace id.

        The following arguments are optional:
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace_id", value)


class RoleAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Amazon Managed Grafana workspace role association resource.

        ## Example Usage

        ### Basic configuration

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        assume = aws.iam.Role("assume",
            name="grafana-assume",
            assume_role_policy=json.dumps({
                "version": "2012-10-17",
                "statement": [{
                    "action": "sts:AssumeRole",
                    "effect": "Allow",
                    "sid": "",
                    "principal": {
                        "service": "grafana.amazonaws.com",
                    },
                }],
            }))
        example_workspace = aws.grafana.Workspace("example",
            account_access_type="CURRENT_ACCOUNT",
            authentication_providers=["SAML"],
            permission_type="SERVICE_MANAGED",
            role_arn=assume.arn)
        example = aws.grafana.RoleAssociation("example",
            role="ADMIN",
            user_ids=[
                "USER_ID_1",
                "USER_ID_2",
            ],
            workspace_id=example_workspace.id)
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] group_ids: The AWS SSO group ids to be assigned the role given in `role`.
        :param pulumi.Input[str] role: The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_ids: The AWS SSO user ids to be assigned the role given in `role`.
        :param pulumi.Input[str] workspace_id: The workspace id.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RoleAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amazon Managed Grafana workspace role association resource.

        ## Example Usage

        ### Basic configuration

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        assume = aws.iam.Role("assume",
            name="grafana-assume",
            assume_role_policy=json.dumps({
                "version": "2012-10-17",
                "statement": [{
                    "action": "sts:AssumeRole",
                    "effect": "Allow",
                    "sid": "",
                    "principal": {
                        "service": "grafana.amazonaws.com",
                    },
                }],
            }))
        example_workspace = aws.grafana.Workspace("example",
            account_access_type="CURRENT_ACCOUNT",
            authentication_providers=["SAML"],
            permission_type="SERVICE_MANAGED",
            role_arn=assume.arn)
        example = aws.grafana.RoleAssociation("example",
            role="ADMIN",
            user_ids=[
                "USER_ID_1",
                "USER_ID_2",
            ],
            workspace_id=example_workspace.id)
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param RoleAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleAssociationArgs.__new__(RoleAssociationArgs)

            __props__.__dict__["group_ids"] = group_ids
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
            __props__.__dict__["user_ids"] = user_ids
            if workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_id'")
            __props__.__dict__["workspace_id"] = workspace_id
        super(RoleAssociation, __self__).__init__(
            'aws:grafana/roleAssociation:RoleAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            role: Optional[pulumi.Input[str]] = None,
            user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            workspace_id: Optional[pulumi.Input[str]] = None) -> 'RoleAssociation':
        """
        Get an existing RoleAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] group_ids: The AWS SSO group ids to be assigned the role given in `role`.
        :param pulumi.Input[str] role: The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_ids: The AWS SSO user ids to be assigned the role given in `role`.
        :param pulumi.Input[str] workspace_id: The workspace id.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleAssociationState.__new__(_RoleAssociationState)

        __props__.__dict__["group_ids"] = group_ids
        __props__.__dict__["role"] = role
        __props__.__dict__["user_ids"] = user_ids
        __props__.__dict__["workspace_id"] = workspace_id
        return RoleAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupIds")
    def group_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The AWS SSO group ids to be assigned the role given in `role`.
        """
        return pulumi.get(self, "group_ids")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[str]:
        """
        The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="userIds")
    def user_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The AWS SSO user ids to be assigned the role given in `role`.
        """
        return pulumi.get(self, "user_ids")

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Output[str]:
        """
        The workspace id.

        The following arguments are optional:
        """
        return pulumi.get(self, "workspace_id")

