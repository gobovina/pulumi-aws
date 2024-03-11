# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecretVersionArgs', 'SecretVersion']

@pulumi.input_type
class SecretVersionArgs:
    def __init__(__self__, *,
                 secret_id: pulumi.Input[str],
                 secret_binary: Optional[pulumi.Input[str]] = None,
                 secret_string: Optional[pulumi.Input[str]] = None,
                 version_stages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SecretVersion resource.
        :param pulumi.Input[str] secret_id: Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        :param pulumi.Input[str] secret_binary: Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        :param pulumi.Input[str] secret_string: Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] version_stages: Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
               
               > **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        """
        pulumi.set(__self__, "secret_id", secret_id)
        if secret_binary is not None:
            pulumi.set(__self__, "secret_binary", secret_binary)
        if secret_string is not None:
            pulumi.set(__self__, "secret_string", secret_string)
        if version_stages is not None:
            pulumi.set(__self__, "version_stages", version_stages)

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> pulumi.Input[str]:
        """
        Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        """
        return pulumi.get(self, "secret_id")

    @secret_id.setter
    def secret_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret_id", value)

    @property
    @pulumi.getter(name="secretBinary")
    def secret_binary(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        """
        return pulumi.get(self, "secret_binary")

    @secret_binary.setter
    def secret_binary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_binary", value)

    @property
    @pulumi.getter(name="secretString")
    def secret_string(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        """
        return pulumi.get(self, "secret_string")

    @secret_string.setter
    def secret_string(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_string", value)

    @property
    @pulumi.getter(name="versionStages")
    def version_stages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.

        > **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        """
        return pulumi.get(self, "version_stages")

    @version_stages.setter
    def version_stages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "version_stages", value)


@pulumi.input_type
class _SecretVersionState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 secret_binary: Optional[pulumi.Input[str]] = None,
                 secret_id: Optional[pulumi.Input[str]] = None,
                 secret_string: Optional[pulumi.Input[str]] = None,
                 version_id: Optional[pulumi.Input[str]] = None,
                 version_stages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering SecretVersion resources.
        :param pulumi.Input[str] arn: The ARN of the secret.
        :param pulumi.Input[str] secret_binary: Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        :param pulumi.Input[str] secret_id: Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        :param pulumi.Input[str] secret_string: Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        :param pulumi.Input[str] version_id: The unique identifier of the version of the secret.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] version_stages: Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
               
               > **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if secret_binary is not None:
            pulumi.set(__self__, "secret_binary", secret_binary)
        if secret_id is not None:
            pulumi.set(__self__, "secret_id", secret_id)
        if secret_string is not None:
            pulumi.set(__self__, "secret_string", secret_string)
        if version_id is not None:
            pulumi.set(__self__, "version_id", version_id)
        if version_stages is not None:
            pulumi.set(__self__, "version_stages", version_stages)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the secret.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="secretBinary")
    def secret_binary(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        """
        return pulumi.get(self, "secret_binary")

    @secret_binary.setter
    def secret_binary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_binary", value)

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        """
        return pulumi.get(self, "secret_id")

    @secret_id.setter
    def secret_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_id", value)

    @property
    @pulumi.getter(name="secretString")
    def secret_string(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        """
        return pulumi.get(self, "secret_string")

    @secret_string.setter
    def secret_string(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_string", value)

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier of the version of the secret.
        """
        return pulumi.get(self, "version_id")

    @version_id.setter
    def version_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_id", value)

    @property
    @pulumi.getter(name="versionStages")
    def version_stages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.

        > **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        """
        return pulumi.get(self, "version_stages")

    @version_stages.setter
    def version_stages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "version_stages", value)


class SecretVersion(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 secret_binary: Optional[pulumi.Input[str]] = None,
                 secret_id: Optional[pulumi.Input[str]] = None,
                 secret_string: Optional[pulumi.Input[str]] = None,
                 version_stages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `secretsmanager.Secret` resource.

        > **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.

        ## Example Usage

        ### Simple String Value

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.secretsmanager.SecretVersion("example",
            secret_id=example_aws_secretsmanager_secret["id"],
            secret_string="example-string-to-protect")
        ```
        <!--End PulumiCodeChooser -->

        ### Key-Value Pairs

        Secrets Manager also accepts key-value pairs in JSON.

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        config = pulumi.Config()
        example = config.get_object("example")
        if example is None:
            example = {
                "key1": "value1",
                "key2": "value2",
            }
        example_secret_version = aws.secretsmanager.SecretVersion("example",
            secret_id=example_aws_secretsmanager_secret["id"],
            secret_string=json.dumps(example))
        ```
        <!--End PulumiCodeChooser -->

        Reading key-value pairs from JSON back into a native map

        ## Import

        Using `pulumi import`, import `aws_secretsmanager_secret_version` using the secret ID and version ID. For example:

        ```sh
        $ pulumi import aws:secretsmanager/secretVersion:SecretVersion example 'arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456|xxxxx-xxxxxxx-xxxxxxx-xxxxx'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] secret_binary: Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        :param pulumi.Input[str] secret_id: Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        :param pulumi.Input[str] secret_string: Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] version_stages: Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
               
               > **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretVersionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `secretsmanager.Secret` resource.

        > **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.

        ## Example Usage

        ### Simple String Value

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.secretsmanager.SecretVersion("example",
            secret_id=example_aws_secretsmanager_secret["id"],
            secret_string="example-string-to-protect")
        ```
        <!--End PulumiCodeChooser -->

        ### Key-Value Pairs

        Secrets Manager also accepts key-value pairs in JSON.

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        config = pulumi.Config()
        example = config.get_object("example")
        if example is None:
            example = {
                "key1": "value1",
                "key2": "value2",
            }
        example_secret_version = aws.secretsmanager.SecretVersion("example",
            secret_id=example_aws_secretsmanager_secret["id"],
            secret_string=json.dumps(example))
        ```
        <!--End PulumiCodeChooser -->

        Reading key-value pairs from JSON back into a native map

        ## Import

        Using `pulumi import`, import `aws_secretsmanager_secret_version` using the secret ID and version ID. For example:

        ```sh
        $ pulumi import aws:secretsmanager/secretVersion:SecretVersion example 'arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456|xxxxx-xxxxxxx-xxxxxxx-xxxxx'
        ```

        :param str resource_name: The name of the resource.
        :param SecretVersionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretVersionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 secret_binary: Optional[pulumi.Input[str]] = None,
                 secret_id: Optional[pulumi.Input[str]] = None,
                 secret_string: Optional[pulumi.Input[str]] = None,
                 version_stages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretVersionArgs.__new__(SecretVersionArgs)

            __props__.__dict__["secret_binary"] = None if secret_binary is None else pulumi.Output.secret(secret_binary)
            if secret_id is None and not opts.urn:
                raise TypeError("Missing required property 'secret_id'")
            __props__.__dict__["secret_id"] = secret_id
            __props__.__dict__["secret_string"] = None if secret_string is None else pulumi.Output.secret(secret_string)
            __props__.__dict__["version_stages"] = version_stages
            __props__.__dict__["arn"] = None
            __props__.__dict__["version_id"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secretBinary", "secretString"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SecretVersion, __self__).__init__(
            'aws:secretsmanager/secretVersion:SecretVersion',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            secret_binary: Optional[pulumi.Input[str]] = None,
            secret_id: Optional[pulumi.Input[str]] = None,
            secret_string: Optional[pulumi.Input[str]] = None,
            version_id: Optional[pulumi.Input[str]] = None,
            version_stages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'SecretVersion':
        """
        Get an existing SecretVersion resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the secret.
        :param pulumi.Input[str] secret_binary: Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        :param pulumi.Input[str] secret_id: Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        :param pulumi.Input[str] secret_string: Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        :param pulumi.Input[str] version_id: The unique identifier of the version of the secret.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] version_stages: Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
               
               > **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretVersionState.__new__(_SecretVersionState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["secret_binary"] = secret_binary
        __props__.__dict__["secret_id"] = secret_id
        __props__.__dict__["secret_string"] = secret_string
        __props__.__dict__["version_id"] = version_id
        __props__.__dict__["version_stages"] = version_stages
        return SecretVersion(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the secret.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="secretBinary")
    def secret_binary(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        """
        return pulumi.get(self, "secret_binary")

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> pulumi.Output[str]:
        """
        Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        """
        return pulumi.get(self, "secret_id")

    @property
    @pulumi.getter(name="secretString")
    def secret_string(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        """
        return pulumi.get(self, "secret_string")

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> pulumi.Output[str]:
        """
        The unique identifier of the version of the secret.
        """
        return pulumi.get(self, "version_id")

    @property
    @pulumi.getter(name="versionStages")
    def version_stages(self) -> pulumi.Output[Sequence[str]]:
        """
        Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.

        > **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        """
        return pulumi.get(self, "version_stages")

