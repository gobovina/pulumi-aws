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

__all__ = ['CiphertextArgs', 'Ciphertext']

@pulumi.input_type
class CiphertextArgs:
    def __init__(__self__, *,
                 key_id: pulumi.Input[str],
                 plaintext: pulumi.Input[str],
                 context: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Ciphertext resource.
        :param pulumi.Input[str] key_id: Globally unique key ID for the customer master key.
        :param pulumi.Input[str] plaintext: Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] context: An optional mapping that makes up the encryption context.
        """
        pulumi.set(__self__, "key_id", key_id)
        pulumi.set(__self__, "plaintext", plaintext)
        if context is not None:
            pulumi.set(__self__, "context", context)

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Input[str]:
        """
        Globally unique key ID for the customer master key.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_id", value)

    @property
    @pulumi.getter
    def plaintext(self) -> pulumi.Input[str]:
        """
        Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        """
        return pulumi.get(self, "plaintext")

    @plaintext.setter
    def plaintext(self, value: pulumi.Input[str]):
        pulumi.set(self, "plaintext", value)

    @property
    @pulumi.getter
    def context(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        An optional mapping that makes up the encryption context.
        """
        return pulumi.get(self, "context")

    @context.setter
    def context(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "context", value)


@pulumi.input_type
class _CiphertextState:
    def __init__(__self__, *,
                 ciphertext_blob: Optional[pulumi.Input[str]] = None,
                 context: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 plaintext: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Ciphertext resources.
        :param pulumi.Input[str] ciphertext_blob: Base64 encoded ciphertext
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] context: An optional mapping that makes up the encryption context.
        :param pulumi.Input[str] key_id: Globally unique key ID for the customer master key.
        :param pulumi.Input[str] plaintext: Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        """
        if ciphertext_blob is not None:
            pulumi.set(__self__, "ciphertext_blob", ciphertext_blob)
        if context is not None:
            pulumi.set(__self__, "context", context)
        if key_id is not None:
            pulumi.set(__self__, "key_id", key_id)
        if plaintext is not None:
            pulumi.set(__self__, "plaintext", plaintext)

    @property
    @pulumi.getter(name="ciphertextBlob")
    def ciphertext_blob(self) -> Optional[pulumi.Input[str]]:
        """
        Base64 encoded ciphertext
        """
        return pulumi.get(self, "ciphertext_blob")

    @ciphertext_blob.setter
    def ciphertext_blob(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ciphertext_blob", value)

    @property
    @pulumi.getter
    def context(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        An optional mapping that makes up the encryption context.
        """
        return pulumi.get(self, "context")

    @context.setter
    def context(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "context", value)

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> Optional[pulumi.Input[str]]:
        """
        Globally unique key ID for the customer master key.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_id", value)

    @property
    @pulumi.getter
    def plaintext(self) -> Optional[pulumi.Input[str]]:
        """
        Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        """
        return pulumi.get(self, "plaintext")

    @plaintext.setter
    def plaintext(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plaintext", value)


class Ciphertext(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 context: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 plaintext: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The KMS ciphertext resource allows you to encrypt plaintext into ciphertext
        by using an AWS KMS customer master key. The value returned by this resource
        is stable across every apply. For a changing ciphertext value each apply, see
        the `kms.Ciphertext` data source.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        oauth_config = aws.kms.Key("oauth_config",
            description="oauth config",
            is_enabled=True)
        oauth = aws.kms.Ciphertext("oauth",
            key_id=oauth_config.key_id,
            plaintext=\"\"\"{
          "client_id": "e587dbae22222f55da22",
          "client_secret": "8289575d00000ace55e1815ec13673955721b8a5"
        }
        \"\"\")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] context: An optional mapping that makes up the encryption context.
        :param pulumi.Input[str] key_id: Globally unique key ID for the customer master key.
        :param pulumi.Input[str] plaintext: Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CiphertextArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The KMS ciphertext resource allows you to encrypt plaintext into ciphertext
        by using an AWS KMS customer master key. The value returned by this resource
        is stable across every apply. For a changing ciphertext value each apply, see
        the `kms.Ciphertext` data source.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        oauth_config = aws.kms.Key("oauth_config",
            description="oauth config",
            is_enabled=True)
        oauth = aws.kms.Ciphertext("oauth",
            key_id=oauth_config.key_id,
            plaintext=\"\"\"{
          "client_id": "e587dbae22222f55da22",
          "client_secret": "8289575d00000ace55e1815ec13673955721b8a5"
        }
        \"\"\")
        ```

        :param str resource_name: The name of the resource.
        :param CiphertextArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CiphertextArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 context: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 plaintext: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CiphertextArgs.__new__(CiphertextArgs)

            __props__.__dict__["context"] = context
            if key_id is None and not opts.urn:
                raise TypeError("Missing required property 'key_id'")
            __props__.__dict__["key_id"] = key_id
            if plaintext is None and not opts.urn:
                raise TypeError("Missing required property 'plaintext'")
            __props__.__dict__["plaintext"] = None if plaintext is None else pulumi.Output.secret(plaintext)
            __props__.__dict__["ciphertext_blob"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["plaintext"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Ciphertext, __self__).__init__(
            'aws:kms/ciphertext:Ciphertext',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ciphertext_blob: Optional[pulumi.Input[str]] = None,
            context: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            key_id: Optional[pulumi.Input[str]] = None,
            plaintext: Optional[pulumi.Input[str]] = None) -> 'Ciphertext':
        """
        Get an existing Ciphertext resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ciphertext_blob: Base64 encoded ciphertext
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] context: An optional mapping that makes up the encryption context.
        :param pulumi.Input[str] key_id: Globally unique key ID for the customer master key.
        :param pulumi.Input[str] plaintext: Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CiphertextState.__new__(_CiphertextState)

        __props__.__dict__["ciphertext_blob"] = ciphertext_blob
        __props__.__dict__["context"] = context
        __props__.__dict__["key_id"] = key_id
        __props__.__dict__["plaintext"] = plaintext
        return Ciphertext(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="ciphertextBlob")
    def ciphertext_blob(self) -> pulumi.Output[str]:
        """
        Base64 encoded ciphertext
        """
        return pulumi.get(self, "ciphertext_blob")

    @property
    @pulumi.getter
    def context(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        An optional mapping that makes up the encryption context.
        """
        return pulumi.get(self, "context")

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Output[str]:
        """
        Globally unique key ID for the customer master key.
        """
        return pulumi.get(self, "key_id")

    @property
    @pulumi.getter
    def plaintext(self) -> pulumi.Output[str]:
        """
        Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        """
        return pulumi.get(self, "plaintext")

