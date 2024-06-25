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

__all__ = ['AccountRegistrationArgs', 'AccountRegistration']

@pulumi.input_type
class AccountRegistrationArgs:
    def __init__(__self__, *,
                 delegated_admin_account: Optional[pulumi.Input[str]] = None,
                 deregister_on_destroy: Optional[pulumi.Input[bool]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccountRegistration resource.
        :param pulumi.Input[str] delegated_admin_account: Identifier for the delegated administrator account.
        :param pulumi.Input[bool] deregister_on_destroy: Flag to deregister AuditManager in the account upon destruction. Defaults to `false` (ie. AuditManager will remain active in the account, even if this resource is removed).
        :param pulumi.Input[str] kms_key: KMS key identifier.
        """
        if delegated_admin_account is not None:
            pulumi.set(__self__, "delegated_admin_account", delegated_admin_account)
        if deregister_on_destroy is not None:
            pulumi.set(__self__, "deregister_on_destroy", deregister_on_destroy)
        if kms_key is not None:
            pulumi.set(__self__, "kms_key", kms_key)

    @property
    @pulumi.getter(name="delegatedAdminAccount")
    def delegated_admin_account(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier for the delegated administrator account.
        """
        return pulumi.get(self, "delegated_admin_account")

    @delegated_admin_account.setter
    def delegated_admin_account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delegated_admin_account", value)

    @property
    @pulumi.getter(name="deregisterOnDestroy")
    def deregister_on_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag to deregister AuditManager in the account upon destruction. Defaults to `false` (ie. AuditManager will remain active in the account, even if this resource is removed).
        """
        return pulumi.get(self, "deregister_on_destroy")

    @deregister_on_destroy.setter
    def deregister_on_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deregister_on_destroy", value)

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> Optional[pulumi.Input[str]]:
        """
        KMS key identifier.
        """
        return pulumi.get(self, "kms_key")

    @kms_key.setter
    def kms_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key", value)


@pulumi.input_type
class _AccountRegistrationState:
    def __init__(__self__, *,
                 delegated_admin_account: Optional[pulumi.Input[str]] = None,
                 deregister_on_destroy: Optional[pulumi.Input[bool]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccountRegistration resources.
        :param pulumi.Input[str] delegated_admin_account: Identifier for the delegated administrator account.
        :param pulumi.Input[bool] deregister_on_destroy: Flag to deregister AuditManager in the account upon destruction. Defaults to `false` (ie. AuditManager will remain active in the account, even if this resource is removed).
        :param pulumi.Input[str] kms_key: KMS key identifier.
        :param pulumi.Input[str] status: Status of the account registration request.
        """
        if delegated_admin_account is not None:
            pulumi.set(__self__, "delegated_admin_account", delegated_admin_account)
        if deregister_on_destroy is not None:
            pulumi.set(__self__, "deregister_on_destroy", deregister_on_destroy)
        if kms_key is not None:
            pulumi.set(__self__, "kms_key", kms_key)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="delegatedAdminAccount")
    def delegated_admin_account(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier for the delegated administrator account.
        """
        return pulumi.get(self, "delegated_admin_account")

    @delegated_admin_account.setter
    def delegated_admin_account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delegated_admin_account", value)

    @property
    @pulumi.getter(name="deregisterOnDestroy")
    def deregister_on_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag to deregister AuditManager in the account upon destruction. Defaults to `false` (ie. AuditManager will remain active in the account, even if this resource is removed).
        """
        return pulumi.get(self, "deregister_on_destroy")

    @deregister_on_destroy.setter
    def deregister_on_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deregister_on_destroy", value)

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> Optional[pulumi.Input[str]]:
        """
        KMS key identifier.
        """
        return pulumi.get(self, "kms_key")

    @kms_key.setter
    def kms_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the account registration request.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class AccountRegistration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delegated_admin_account: Optional[pulumi.Input[str]] = None,
                 deregister_on_destroy: Optional[pulumi.Input[bool]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing AWS Audit Manager Account Registration.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.auditmanager.AccountRegistration("example")
        ```

        ### Deregister On Destroy

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.auditmanager.AccountRegistration("example", deregister_on_destroy=True)
        ```

        ## Import

        Using `pulumi import`, import Audit Manager Account Registration resources using the `id`. For example:

        ```sh
        $ pulumi import aws:auditmanager/accountRegistration:AccountRegistration example us-east-1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delegated_admin_account: Identifier for the delegated administrator account.
        :param pulumi.Input[bool] deregister_on_destroy: Flag to deregister AuditManager in the account upon destruction. Defaults to `false` (ie. AuditManager will remain active in the account, even if this resource is removed).
        :param pulumi.Input[str] kms_key: KMS key identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AccountRegistrationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing AWS Audit Manager Account Registration.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.auditmanager.AccountRegistration("example")
        ```

        ### Deregister On Destroy

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.auditmanager.AccountRegistration("example", deregister_on_destroy=True)
        ```

        ## Import

        Using `pulumi import`, import Audit Manager Account Registration resources using the `id`. For example:

        ```sh
        $ pulumi import aws:auditmanager/accountRegistration:AccountRegistration example us-east-1
        ```

        :param str resource_name: The name of the resource.
        :param AccountRegistrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountRegistrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delegated_admin_account: Optional[pulumi.Input[str]] = None,
                 deregister_on_destroy: Optional[pulumi.Input[bool]] = None,
                 kms_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountRegistrationArgs.__new__(AccountRegistrationArgs)

            __props__.__dict__["delegated_admin_account"] = delegated_admin_account
            __props__.__dict__["deregister_on_destroy"] = deregister_on_destroy
            __props__.__dict__["kms_key"] = kms_key
            __props__.__dict__["status"] = None
        super(AccountRegistration, __self__).__init__(
            'aws:auditmanager/accountRegistration:AccountRegistration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delegated_admin_account: Optional[pulumi.Input[str]] = None,
            deregister_on_destroy: Optional[pulumi.Input[bool]] = None,
            kms_key: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'AccountRegistration':
        """
        Get an existing AccountRegistration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delegated_admin_account: Identifier for the delegated administrator account.
        :param pulumi.Input[bool] deregister_on_destroy: Flag to deregister AuditManager in the account upon destruction. Defaults to `false` (ie. AuditManager will remain active in the account, even if this resource is removed).
        :param pulumi.Input[str] kms_key: KMS key identifier.
        :param pulumi.Input[str] status: Status of the account registration request.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountRegistrationState.__new__(_AccountRegistrationState)

        __props__.__dict__["delegated_admin_account"] = delegated_admin_account
        __props__.__dict__["deregister_on_destroy"] = deregister_on_destroy
        __props__.__dict__["kms_key"] = kms_key
        __props__.__dict__["status"] = status
        return AccountRegistration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="delegatedAdminAccount")
    def delegated_admin_account(self) -> pulumi.Output[Optional[str]]:
        """
        Identifier for the delegated administrator account.
        """
        return pulumi.get(self, "delegated_admin_account")

    @property
    @pulumi.getter(name="deregisterOnDestroy")
    def deregister_on_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Flag to deregister AuditManager in the account upon destruction. Defaults to `false` (ie. AuditManager will remain active in the account, even if this resource is removed).
        """
        return pulumi.get(self, "deregister_on_destroy")

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> pulumi.Output[Optional[str]]:
        """
        KMS key identifier.
        """
        return pulumi.get(self, "kms_key")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the account registration request.
        """
        return pulumi.get(self, "status")

