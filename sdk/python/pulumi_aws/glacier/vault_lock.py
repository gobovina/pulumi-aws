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

__all__ = ['VaultLockArgs', 'VaultLock']

@pulumi.input_type
class VaultLockArgs:
    def __init__(__self__, *,
                 complete_lock: pulumi.Input[bool],
                 policy: pulumi.Input[str],
                 vault_name: pulumi.Input[str],
                 ignore_deletion_error: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a VaultLock resource.
        :param pulumi.Input[bool] complete_lock: Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
        :param pulumi.Input[str] policy: JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
        :param pulumi.Input[str] vault_name: The name of the Glacier Vault.
        :param pulumi.Input[bool] ignore_deletion_error: Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
        """
        pulumi.set(__self__, "complete_lock", complete_lock)
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "vault_name", vault_name)
        if ignore_deletion_error is not None:
            pulumi.set(__self__, "ignore_deletion_error", ignore_deletion_error)

    @property
    @pulumi.getter(name="completeLock")
    def complete_lock(self) -> pulumi.Input[bool]:
        """
        Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
        """
        return pulumi.get(self, "complete_lock")

    @complete_lock.setter
    def complete_lock(self, value: pulumi.Input[bool]):
        pulumi.set(self, "complete_lock", value)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="vaultName")
    def vault_name(self) -> pulumi.Input[str]:
        """
        The name of the Glacier Vault.
        """
        return pulumi.get(self, "vault_name")

    @vault_name.setter
    def vault_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "vault_name", value)

    @property
    @pulumi.getter(name="ignoreDeletionError")
    def ignore_deletion_error(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
        """
        return pulumi.get(self, "ignore_deletion_error")

    @ignore_deletion_error.setter
    def ignore_deletion_error(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_deletion_error", value)


@pulumi.input_type
class _VaultLockState:
    def __init__(__self__, *,
                 complete_lock: Optional[pulumi.Input[bool]] = None,
                 ignore_deletion_error: Optional[pulumi.Input[bool]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 vault_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VaultLock resources.
        :param pulumi.Input[bool] complete_lock: Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
        :param pulumi.Input[bool] ignore_deletion_error: Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
        :param pulumi.Input[str] policy: JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
        :param pulumi.Input[str] vault_name: The name of the Glacier Vault.
        """
        if complete_lock is not None:
            pulumi.set(__self__, "complete_lock", complete_lock)
        if ignore_deletion_error is not None:
            pulumi.set(__self__, "ignore_deletion_error", ignore_deletion_error)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if vault_name is not None:
            pulumi.set(__self__, "vault_name", vault_name)

    @property
    @pulumi.getter(name="completeLock")
    def complete_lock(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
        """
        return pulumi.get(self, "complete_lock")

    @complete_lock.setter
    def complete_lock(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "complete_lock", value)

    @property
    @pulumi.getter(name="ignoreDeletionError")
    def ignore_deletion_error(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
        """
        return pulumi.get(self, "ignore_deletion_error")

    @ignore_deletion_error.setter
    def ignore_deletion_error(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_deletion_error", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="vaultName")
    def vault_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Glacier Vault.
        """
        return pulumi.get(self, "vault_name")

    @vault_name.setter
    def vault_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vault_name", value)


class VaultLock(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 complete_lock: Optional[pulumi.Input[bool]] = None,
                 ignore_deletion_error: Optional[pulumi.Input[bool]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 vault_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Testing Glacier Vault Lock Policy

        ```python
        import pulumi
        import pulumi_aws as aws

        example_vault = aws.glacier.Vault("example", name="example")
        example = aws.iam.get_policy_document_output(statements=[{
            "actions": ["glacier:DeleteArchive"],
            "effect": "Deny",
            "resources": [example_vault.arn],
            "conditions": [{
                "test": "NumericLessThanEquals",
                "variable": "glacier:ArchiveAgeinDays",
                "values": ["365"],
            }],
        }])
        example_vault_lock = aws.glacier.VaultLock("example",
            complete_lock=False,
            policy=example.json,
            vault_name=example_vault.name)
        ```

        ### Permanently Applying Glacier Vault Lock Policy

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glacier.VaultLock("example",
            complete_lock=True,
            policy=example_aws_iam_policy_document["json"],
            vault_name=example_aws_glacier_vault["name"])
        ```

        ## Import

        Using `pulumi import`, import Glacier Vault Locks using the Glacier Vault name. For example:

        ```sh
        $ pulumi import aws:glacier/vaultLock:VaultLock example example-vault
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] complete_lock: Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
        :param pulumi.Input[bool] ignore_deletion_error: Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
        :param pulumi.Input[str] policy: JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
        :param pulumi.Input[str] vault_name: The name of the Glacier Vault.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VaultLockArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Testing Glacier Vault Lock Policy

        ```python
        import pulumi
        import pulumi_aws as aws

        example_vault = aws.glacier.Vault("example", name="example")
        example = aws.iam.get_policy_document_output(statements=[{
            "actions": ["glacier:DeleteArchive"],
            "effect": "Deny",
            "resources": [example_vault.arn],
            "conditions": [{
                "test": "NumericLessThanEquals",
                "variable": "glacier:ArchiveAgeinDays",
                "values": ["365"],
            }],
        }])
        example_vault_lock = aws.glacier.VaultLock("example",
            complete_lock=False,
            policy=example.json,
            vault_name=example_vault.name)
        ```

        ### Permanently Applying Glacier Vault Lock Policy

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.glacier.VaultLock("example",
            complete_lock=True,
            policy=example_aws_iam_policy_document["json"],
            vault_name=example_aws_glacier_vault["name"])
        ```

        ## Import

        Using `pulumi import`, import Glacier Vault Locks using the Glacier Vault name. For example:

        ```sh
        $ pulumi import aws:glacier/vaultLock:VaultLock example example-vault
        ```

        :param str resource_name: The name of the resource.
        :param VaultLockArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VaultLockArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 complete_lock: Optional[pulumi.Input[bool]] = None,
                 ignore_deletion_error: Optional[pulumi.Input[bool]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 vault_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VaultLockArgs.__new__(VaultLockArgs)

            if complete_lock is None and not opts.urn:
                raise TypeError("Missing required property 'complete_lock'")
            __props__.__dict__["complete_lock"] = complete_lock
            __props__.__dict__["ignore_deletion_error"] = ignore_deletion_error
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if vault_name is None and not opts.urn:
                raise TypeError("Missing required property 'vault_name'")
            __props__.__dict__["vault_name"] = vault_name
        super(VaultLock, __self__).__init__(
            'aws:glacier/vaultLock:VaultLock',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            complete_lock: Optional[pulumi.Input[bool]] = None,
            ignore_deletion_error: Optional[pulumi.Input[bool]] = None,
            policy: Optional[pulumi.Input[str]] = None,
            vault_name: Optional[pulumi.Input[str]] = None) -> 'VaultLock':
        """
        Get an existing VaultLock resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] complete_lock: Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
        :param pulumi.Input[bool] ignore_deletion_error: Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
        :param pulumi.Input[str] policy: JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
        :param pulumi.Input[str] vault_name: The name of the Glacier Vault.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VaultLockState.__new__(_VaultLockState)

        __props__.__dict__["complete_lock"] = complete_lock
        __props__.__dict__["ignore_deletion_error"] = ignore_deletion_error
        __props__.__dict__["policy"] = policy
        __props__.__dict__["vault_name"] = vault_name
        return VaultLock(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="completeLock")
    def complete_lock(self) -> pulumi.Output[bool]:
        """
        Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
        """
        return pulumi.get(self, "complete_lock")

    @property
    @pulumi.getter(name="ignoreDeletionError")
    def ignore_deletion_error(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
        """
        return pulumi.get(self, "ignore_deletion_error")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="vaultName")
    def vault_name(self) -> pulumi.Output[str]:
        """
        The name of the Glacier Vault.
        """
        return pulumi.get(self, "vault_name")

