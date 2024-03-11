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

__all__ = ['AccessGrantArgs', 'AccessGrant']

@pulumi.input_type
class AccessGrantArgs:
    def __init__(__self__, *,
                 access_grants_location_id: pulumi.Input[str],
                 permission: pulumi.Input[str],
                 access_grants_location_configuration: Optional[pulumi.Input['AccessGrantAccessGrantsLocationConfigurationArgs']] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 grantee: Optional[pulumi.Input['AccessGrantGranteeArgs']] = None,
                 s3_prefix_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a AccessGrant resource.
        :param pulumi.Input[str] access_grants_location_id: The ID of the S3 Access Grants location to with the access grant is giving access.
        :param pulumi.Input[str] permission: The access grant's level of access. Valid values: `READ`, `WRITE`, `READWRITE`.
        :param pulumi.Input['AccessGrantAccessGrantsLocationConfigurationArgs'] access_grants_location_configuration: See Location Configuration below for more details.
        :param pulumi.Input['AccessGrantGranteeArgs'] grantee: See Grantee below for more details.
        :param pulumi.Input[str] s3_prefix_type: If you are creating an access grant that grants access to only one object, set this to `Object`. Valid values: `Object`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "access_grants_location_id", access_grants_location_id)
        pulumi.set(__self__, "permission", permission)
        if access_grants_location_configuration is not None:
            pulumi.set(__self__, "access_grants_location_configuration", access_grants_location_configuration)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if grantee is not None:
            pulumi.set(__self__, "grantee", grantee)
        if s3_prefix_type is not None:
            pulumi.set(__self__, "s3_prefix_type", s3_prefix_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accessGrantsLocationId")
    def access_grants_location_id(self) -> pulumi.Input[str]:
        """
        The ID of the S3 Access Grants location to with the access grant is giving access.
        """
        return pulumi.get(self, "access_grants_location_id")

    @access_grants_location_id.setter
    def access_grants_location_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_grants_location_id", value)

    @property
    @pulumi.getter
    def permission(self) -> pulumi.Input[str]:
        """
        The access grant's level of access. Valid values: `READ`, `WRITE`, `READWRITE`.
        """
        return pulumi.get(self, "permission")

    @permission.setter
    def permission(self, value: pulumi.Input[str]):
        pulumi.set(self, "permission", value)

    @property
    @pulumi.getter(name="accessGrantsLocationConfiguration")
    def access_grants_location_configuration(self) -> Optional[pulumi.Input['AccessGrantAccessGrantsLocationConfigurationArgs']]:
        """
        See Location Configuration below for more details.
        """
        return pulumi.get(self, "access_grants_location_configuration")

    @access_grants_location_configuration.setter
    def access_grants_location_configuration(self, value: Optional[pulumi.Input['AccessGrantAccessGrantsLocationConfigurationArgs']]):
        pulumi.set(self, "access_grants_location_configuration", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def grantee(self) -> Optional[pulumi.Input['AccessGrantGranteeArgs']]:
        """
        See Grantee below for more details.
        """
        return pulumi.get(self, "grantee")

    @grantee.setter
    def grantee(self, value: Optional[pulumi.Input['AccessGrantGranteeArgs']]):
        pulumi.set(self, "grantee", value)

    @property
    @pulumi.getter(name="s3PrefixType")
    def s3_prefix_type(self) -> Optional[pulumi.Input[str]]:
        """
        If you are creating an access grant that grants access to only one object, set this to `Object`. Valid values: `Object`.
        """
        return pulumi.get(self, "s3_prefix_type")

    @s3_prefix_type.setter
    def s3_prefix_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "s3_prefix_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _AccessGrantState:
    def __init__(__self__, *,
                 access_grant_arn: Optional[pulumi.Input[str]] = None,
                 access_grant_id: Optional[pulumi.Input[str]] = None,
                 access_grants_location_configuration: Optional[pulumi.Input['AccessGrantAccessGrantsLocationConfigurationArgs']] = None,
                 access_grants_location_id: Optional[pulumi.Input[str]] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 grant_scope: Optional[pulumi.Input[str]] = None,
                 grantee: Optional[pulumi.Input['AccessGrantGranteeArgs']] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 s3_prefix_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering AccessGrant resources.
        :param pulumi.Input[str] access_grant_arn: Amazon Resource Name (ARN) of the S3 Access Grant.
        :param pulumi.Input[str] access_grant_id: Unique ID of the S3 Access Grant.
        :param pulumi.Input['AccessGrantAccessGrantsLocationConfigurationArgs'] access_grants_location_configuration: See Location Configuration below for more details.
        :param pulumi.Input[str] access_grants_location_id: The ID of the S3 Access Grants location to with the access grant is giving access.
        :param pulumi.Input[str] grant_scope: The access grant's scope.
        :param pulumi.Input['AccessGrantGranteeArgs'] grantee: See Grantee below for more details.
        :param pulumi.Input[str] permission: The access grant's level of access. Valid values: `READ`, `WRITE`, `READWRITE`.
        :param pulumi.Input[str] s3_prefix_type: If you are creating an access grant that grants access to only one object, set this to `Object`. Valid values: `Object`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if access_grant_arn is not None:
            pulumi.set(__self__, "access_grant_arn", access_grant_arn)
        if access_grant_id is not None:
            pulumi.set(__self__, "access_grant_id", access_grant_id)
        if access_grants_location_configuration is not None:
            pulumi.set(__self__, "access_grants_location_configuration", access_grants_location_configuration)
        if access_grants_location_id is not None:
            pulumi.set(__self__, "access_grants_location_id", access_grants_location_id)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if grant_scope is not None:
            pulumi.set(__self__, "grant_scope", grant_scope)
        if grantee is not None:
            pulumi.set(__self__, "grantee", grantee)
        if permission is not None:
            pulumi.set(__self__, "permission", permission)
        if s3_prefix_type is not None:
            pulumi.set(__self__, "s3_prefix_type", s3_prefix_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="accessGrantArn")
    def access_grant_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the S3 Access Grant.
        """
        return pulumi.get(self, "access_grant_arn")

    @access_grant_arn.setter
    def access_grant_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_grant_arn", value)

    @property
    @pulumi.getter(name="accessGrantId")
    def access_grant_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique ID of the S3 Access Grant.
        """
        return pulumi.get(self, "access_grant_id")

    @access_grant_id.setter
    def access_grant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_grant_id", value)

    @property
    @pulumi.getter(name="accessGrantsLocationConfiguration")
    def access_grants_location_configuration(self) -> Optional[pulumi.Input['AccessGrantAccessGrantsLocationConfigurationArgs']]:
        """
        See Location Configuration below for more details.
        """
        return pulumi.get(self, "access_grants_location_configuration")

    @access_grants_location_configuration.setter
    def access_grants_location_configuration(self, value: Optional[pulumi.Input['AccessGrantAccessGrantsLocationConfigurationArgs']]):
        pulumi.set(self, "access_grants_location_configuration", value)

    @property
    @pulumi.getter(name="accessGrantsLocationId")
    def access_grants_location_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the S3 Access Grants location to with the access grant is giving access.
        """
        return pulumi.get(self, "access_grants_location_id")

    @access_grants_location_id.setter
    def access_grants_location_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_grants_location_id", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="grantScope")
    def grant_scope(self) -> Optional[pulumi.Input[str]]:
        """
        The access grant's scope.
        """
        return pulumi.get(self, "grant_scope")

    @grant_scope.setter
    def grant_scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grant_scope", value)

    @property
    @pulumi.getter
    def grantee(self) -> Optional[pulumi.Input['AccessGrantGranteeArgs']]:
        """
        See Grantee below for more details.
        """
        return pulumi.get(self, "grantee")

    @grantee.setter
    def grantee(self, value: Optional[pulumi.Input['AccessGrantGranteeArgs']]):
        pulumi.set(self, "grantee", value)

    @property
    @pulumi.getter
    def permission(self) -> Optional[pulumi.Input[str]]:
        """
        The access grant's level of access. Valid values: `READ`, `WRITE`, `READWRITE`.
        """
        return pulumi.get(self, "permission")

    @permission.setter
    def permission(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "permission", value)

    @property
    @pulumi.getter(name="s3PrefixType")
    def s3_prefix_type(self) -> Optional[pulumi.Input[str]]:
        """
        If you are creating an access grant that grants access to only one object, set this to `Object`. Valid values: `Object`.
        """
        return pulumi.get(self, "s3_prefix_type")

    @s3_prefix_type.setter
    def s3_prefix_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "s3_prefix_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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


class AccessGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_grants_location_configuration: Optional[pulumi.Input[pulumi.InputType['AccessGrantAccessGrantsLocationConfigurationArgs']]] = None,
                 access_grants_location_id: Optional[pulumi.Input[str]] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 grantee: Optional[pulumi.Input[pulumi.InputType['AccessGrantGranteeArgs']]] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 s3_prefix_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage an S3 Access Grant.
        Each access grant has its own ID and gives an IAM user or role or a directory user, or group (the grantee) access to a registered location. You determine the level of access, such as `READ` or `READWRITE`.
        Before you can create a grant, you must have an S3 Access Grants instance in the same Region as the S3 data.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3control.AccessGrantsInstance("example")
        example_access_grants_location = aws.s3control.AccessGrantsLocation("example",
            iam_role_arn=example_aws_iam_role["arn"],
            location_scope=f"s3://{example_aws_s3_bucket['bucket']}/prefixA*")
        example_access_grant = aws.s3control.AccessGrant("example",
            access_grants_location_id=example_access_grants_location.access_grants_location_id,
            permission="READ",
            access_grants_location_configuration=aws.s3control.AccessGrantAccessGrantsLocationConfigurationArgs(
                s3_sub_prefix="prefixB*",
            ),
            grantee=aws.s3control.AccessGrantGranteeArgs(
                grantee_type="IAM",
                grantee_identifier=example_aws_iam_user["arn"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import S3 Access Grants using the `account_id` and `access_grant_id`, separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:s3control/accessGrant:AccessGrant example 123456789012,04549c5e-2f3c-4a07-824d-2cafe720aa22
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AccessGrantAccessGrantsLocationConfigurationArgs']] access_grants_location_configuration: See Location Configuration below for more details.
        :param pulumi.Input[str] access_grants_location_id: The ID of the S3 Access Grants location to with the access grant is giving access.
        :param pulumi.Input[pulumi.InputType['AccessGrantGranteeArgs']] grantee: See Grantee below for more details.
        :param pulumi.Input[str] permission: The access grant's level of access. Valid values: `READ`, `WRITE`, `READWRITE`.
        :param pulumi.Input[str] s3_prefix_type: If you are creating an access grant that grants access to only one object, set this to `Object`. Valid values: `Object`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage an S3 Access Grant.
        Each access grant has its own ID and gives an IAM user or role or a directory user, or group (the grantee) access to a registered location. You determine the level of access, such as `READ` or `READWRITE`.
        Before you can create a grant, you must have an S3 Access Grants instance in the same Region as the S3 data.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3control.AccessGrantsInstance("example")
        example_access_grants_location = aws.s3control.AccessGrantsLocation("example",
            iam_role_arn=example_aws_iam_role["arn"],
            location_scope=f"s3://{example_aws_s3_bucket['bucket']}/prefixA*")
        example_access_grant = aws.s3control.AccessGrant("example",
            access_grants_location_id=example_access_grants_location.access_grants_location_id,
            permission="READ",
            access_grants_location_configuration=aws.s3control.AccessGrantAccessGrantsLocationConfigurationArgs(
                s3_sub_prefix="prefixB*",
            ),
            grantee=aws.s3control.AccessGrantGranteeArgs(
                grantee_type="IAM",
                grantee_identifier=example_aws_iam_user["arn"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import S3 Access Grants using the `account_id` and `access_grant_id`, separated by a comma (`,`). For example:

        ```sh
        $ pulumi import aws:s3control/accessGrant:AccessGrant example 123456789012,04549c5e-2f3c-4a07-824d-2cafe720aa22
        ```

        :param str resource_name: The name of the resource.
        :param AccessGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_grants_location_configuration: Optional[pulumi.Input[pulumi.InputType['AccessGrantAccessGrantsLocationConfigurationArgs']]] = None,
                 access_grants_location_id: Optional[pulumi.Input[str]] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 grantee: Optional[pulumi.Input[pulumi.InputType['AccessGrantGranteeArgs']]] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 s3_prefix_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessGrantArgs.__new__(AccessGrantArgs)

            __props__.__dict__["access_grants_location_configuration"] = access_grants_location_configuration
            if access_grants_location_id is None and not opts.urn:
                raise TypeError("Missing required property 'access_grants_location_id'")
            __props__.__dict__["access_grants_location_id"] = access_grants_location_id
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["grantee"] = grantee
            if permission is None and not opts.urn:
                raise TypeError("Missing required property 'permission'")
            __props__.__dict__["permission"] = permission
            __props__.__dict__["s3_prefix_type"] = s3_prefix_type
            __props__.__dict__["tags"] = tags
            __props__.__dict__["access_grant_arn"] = None
            __props__.__dict__["access_grant_id"] = None
            __props__.__dict__["grant_scope"] = None
            __props__.__dict__["tags_all"] = None
        super(AccessGrant, __self__).__init__(
            'aws:s3control/accessGrant:AccessGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_grant_arn: Optional[pulumi.Input[str]] = None,
            access_grant_id: Optional[pulumi.Input[str]] = None,
            access_grants_location_configuration: Optional[pulumi.Input[pulumi.InputType['AccessGrantAccessGrantsLocationConfigurationArgs']]] = None,
            access_grants_location_id: Optional[pulumi.Input[str]] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            grant_scope: Optional[pulumi.Input[str]] = None,
            grantee: Optional[pulumi.Input[pulumi.InputType['AccessGrantGranteeArgs']]] = None,
            permission: Optional[pulumi.Input[str]] = None,
            s3_prefix_type: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'AccessGrant':
        """
        Get an existing AccessGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_grant_arn: Amazon Resource Name (ARN) of the S3 Access Grant.
        :param pulumi.Input[str] access_grant_id: Unique ID of the S3 Access Grant.
        :param pulumi.Input[pulumi.InputType['AccessGrantAccessGrantsLocationConfigurationArgs']] access_grants_location_configuration: See Location Configuration below for more details.
        :param pulumi.Input[str] access_grants_location_id: The ID of the S3 Access Grants location to with the access grant is giving access.
        :param pulumi.Input[str] grant_scope: The access grant's scope.
        :param pulumi.Input[pulumi.InputType['AccessGrantGranteeArgs']] grantee: See Grantee below for more details.
        :param pulumi.Input[str] permission: The access grant's level of access. Valid values: `READ`, `WRITE`, `READWRITE`.
        :param pulumi.Input[str] s3_prefix_type: If you are creating an access grant that grants access to only one object, set this to `Object`. Valid values: `Object`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessGrantState.__new__(_AccessGrantState)

        __props__.__dict__["access_grant_arn"] = access_grant_arn
        __props__.__dict__["access_grant_id"] = access_grant_id
        __props__.__dict__["access_grants_location_configuration"] = access_grants_location_configuration
        __props__.__dict__["access_grants_location_id"] = access_grants_location_id
        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["grant_scope"] = grant_scope
        __props__.__dict__["grantee"] = grantee
        __props__.__dict__["permission"] = permission
        __props__.__dict__["s3_prefix_type"] = s3_prefix_type
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return AccessGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessGrantArn")
    def access_grant_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the S3 Access Grant.
        """
        return pulumi.get(self, "access_grant_arn")

    @property
    @pulumi.getter(name="accessGrantId")
    def access_grant_id(self) -> pulumi.Output[str]:
        """
        Unique ID of the S3 Access Grant.
        """
        return pulumi.get(self, "access_grant_id")

    @property
    @pulumi.getter(name="accessGrantsLocationConfiguration")
    def access_grants_location_configuration(self) -> pulumi.Output[Optional['outputs.AccessGrantAccessGrantsLocationConfiguration']]:
        """
        See Location Configuration below for more details.
        """
        return pulumi.get(self, "access_grants_location_configuration")

    @property
    @pulumi.getter(name="accessGrantsLocationId")
    def access_grants_location_id(self) -> pulumi.Output[str]:
        """
        The ID of the S3 Access Grants location to with the access grant is giving access.
        """
        return pulumi.get(self, "access_grants_location_id")

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="grantScope")
    def grant_scope(self) -> pulumi.Output[str]:
        """
        The access grant's scope.
        """
        return pulumi.get(self, "grant_scope")

    @property
    @pulumi.getter
    def grantee(self) -> pulumi.Output[Optional['outputs.AccessGrantGrantee']]:
        """
        See Grantee below for more details.
        """
        return pulumi.get(self, "grantee")

    @property
    @pulumi.getter
    def permission(self) -> pulumi.Output[str]:
        """
        The access grant's level of access. Valid values: `READ`, `WRITE`, `READWRITE`.
        """
        return pulumi.get(self, "permission")

    @property
    @pulumi.getter(name="s3PrefixType")
    def s3_prefix_type(self) -> pulumi.Output[Optional[str]]:
        """
        If you are creating an access grant that grants access to only one object, set this to `Object`. Valid values: `Object`.
        """
        return pulumi.get(self, "s3_prefix_type")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

