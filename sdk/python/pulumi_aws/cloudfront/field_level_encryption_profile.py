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

__all__ = ['FieldLevelEncryptionProfileArgs', 'FieldLevelEncryptionProfile']

@pulumi.input_type
class FieldLevelEncryptionProfileArgs:
    def __init__(__self__, *,
                 encryption_entities: pulumi.Input['FieldLevelEncryptionProfileEncryptionEntitiesArgs'],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FieldLevelEncryptionProfile resource.
        :param pulumi.Input['FieldLevelEncryptionProfileEncryptionEntitiesArgs'] encryption_entities: The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
        :param pulumi.Input[str] comment: An optional comment about the Field Level Encryption Profile.
        :param pulumi.Input[str] name: The name of the Field Level Encryption Profile.
        """
        pulumi.set(__self__, "encryption_entities", encryption_entities)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="encryptionEntities")
    def encryption_entities(self) -> pulumi.Input['FieldLevelEncryptionProfileEncryptionEntitiesArgs']:
        """
        The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
        """
        return pulumi.get(self, "encryption_entities")

    @encryption_entities.setter
    def encryption_entities(self, value: pulumi.Input['FieldLevelEncryptionProfileEncryptionEntitiesArgs']):
        pulumi.set(self, "encryption_entities", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        An optional comment about the Field Level Encryption Profile.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Field Level Encryption Profile.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FieldLevelEncryptionProfileState:
    def __init__(__self__, *,
                 caller_reference: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 encryption_entities: Optional[pulumi.Input['FieldLevelEncryptionProfileEncryptionEntitiesArgs']] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FieldLevelEncryptionProfile resources.
        :param pulumi.Input[str] caller_reference: Internal value used by CloudFront to allow future updates to the Field Level Encryption Profile.
        :param pulumi.Input[str] comment: An optional comment about the Field Level Encryption Profile.
        :param pulumi.Input['FieldLevelEncryptionProfileEncryptionEntitiesArgs'] encryption_entities: The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
        :param pulumi.Input[str] etag: The current version of the Field Level Encryption Profile. For example: `E2QWRUHAPOMQZL`.
        :param pulumi.Input[str] name: The name of the Field Level Encryption Profile.
        """
        if caller_reference is not None:
            pulumi.set(__self__, "caller_reference", caller_reference)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if encryption_entities is not None:
            pulumi.set(__self__, "encryption_entities", encryption_entities)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="callerReference")
    def caller_reference(self) -> Optional[pulumi.Input[str]]:
        """
        Internal value used by CloudFront to allow future updates to the Field Level Encryption Profile.
        """
        return pulumi.get(self, "caller_reference")

    @caller_reference.setter
    def caller_reference(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "caller_reference", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        An optional comment about the Field Level Encryption Profile.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="encryptionEntities")
    def encryption_entities(self) -> Optional[pulumi.Input['FieldLevelEncryptionProfileEncryptionEntitiesArgs']]:
        """
        The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
        """
        return pulumi.get(self, "encryption_entities")

    @encryption_entities.setter
    def encryption_entities(self, value: Optional[pulumi.Input['FieldLevelEncryptionProfileEncryptionEntitiesArgs']]):
        pulumi.set(self, "encryption_entities", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        """
        The current version of the Field Level Encryption Profile. For example: `E2QWRUHAPOMQZL`.
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Field Level Encryption Profile.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class FieldLevelEncryptionProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 encryption_entities: Optional[pulumi.Input[pulumi.InputType['FieldLevelEncryptionProfileEncryptionEntitiesArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CloudFront Field-level Encryption Profile resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.cloudfront.PublicKey("example",
            comment="test public key",
            encoded_key=std.file(input="public_key.pem").result,
            name="test_key")
        test = aws.cloudfront.FieldLevelEncryptionProfile("test",
            comment="test comment",
            name="test profile",
            encryption_entities=aws.cloudfront.FieldLevelEncryptionProfileEncryptionEntitiesArgs(
                items=[aws.cloudfront.FieldLevelEncryptionProfileEncryptionEntitiesItemArgs(
                    public_key_id=example.id,
                    provider_id="test provider",
                    field_patterns=aws.cloudfront.FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsArgs(
                        items=["DateOfBirth"],
                    ),
                )],
            ))
        ```

        ## Import

        Using `pulumi import`, import Cloudfront Field Level Encryption Profile using the `id`. For example:

        ```sh
         $ pulumi import aws:cloudfront/fieldLevelEncryptionProfile:FieldLevelEncryptionProfile profile K3D5EWEUDCCXON
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: An optional comment about the Field Level Encryption Profile.
        :param pulumi.Input[pulumi.InputType['FieldLevelEncryptionProfileEncryptionEntitiesArgs']] encryption_entities: The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
        :param pulumi.Input[str] name: The name of the Field Level Encryption Profile.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FieldLevelEncryptionProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CloudFront Field-level Encryption Profile resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.cloudfront.PublicKey("example",
            comment="test public key",
            encoded_key=std.file(input="public_key.pem").result,
            name="test_key")
        test = aws.cloudfront.FieldLevelEncryptionProfile("test",
            comment="test comment",
            name="test profile",
            encryption_entities=aws.cloudfront.FieldLevelEncryptionProfileEncryptionEntitiesArgs(
                items=[aws.cloudfront.FieldLevelEncryptionProfileEncryptionEntitiesItemArgs(
                    public_key_id=example.id,
                    provider_id="test provider",
                    field_patterns=aws.cloudfront.FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsArgs(
                        items=["DateOfBirth"],
                    ),
                )],
            ))
        ```

        ## Import

        Using `pulumi import`, import Cloudfront Field Level Encryption Profile using the `id`. For example:

        ```sh
         $ pulumi import aws:cloudfront/fieldLevelEncryptionProfile:FieldLevelEncryptionProfile profile K3D5EWEUDCCXON
        ```

        :param str resource_name: The name of the resource.
        :param FieldLevelEncryptionProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FieldLevelEncryptionProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 encryption_entities: Optional[pulumi.Input[pulumi.InputType['FieldLevelEncryptionProfileEncryptionEntitiesArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FieldLevelEncryptionProfileArgs.__new__(FieldLevelEncryptionProfileArgs)

            __props__.__dict__["comment"] = comment
            if encryption_entities is None and not opts.urn:
                raise TypeError("Missing required property 'encryption_entities'")
            __props__.__dict__["encryption_entities"] = encryption_entities
            __props__.__dict__["name"] = name
            __props__.__dict__["caller_reference"] = None
            __props__.__dict__["etag"] = None
        super(FieldLevelEncryptionProfile, __self__).__init__(
            'aws:cloudfront/fieldLevelEncryptionProfile:FieldLevelEncryptionProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            caller_reference: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            encryption_entities: Optional[pulumi.Input[pulumi.InputType['FieldLevelEncryptionProfileEncryptionEntitiesArgs']]] = None,
            etag: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'FieldLevelEncryptionProfile':
        """
        Get an existing FieldLevelEncryptionProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] caller_reference: Internal value used by CloudFront to allow future updates to the Field Level Encryption Profile.
        :param pulumi.Input[str] comment: An optional comment about the Field Level Encryption Profile.
        :param pulumi.Input[pulumi.InputType['FieldLevelEncryptionProfileEncryptionEntitiesArgs']] encryption_entities: The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
        :param pulumi.Input[str] etag: The current version of the Field Level Encryption Profile. For example: `E2QWRUHAPOMQZL`.
        :param pulumi.Input[str] name: The name of the Field Level Encryption Profile.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FieldLevelEncryptionProfileState.__new__(_FieldLevelEncryptionProfileState)

        __props__.__dict__["caller_reference"] = caller_reference
        __props__.__dict__["comment"] = comment
        __props__.__dict__["encryption_entities"] = encryption_entities
        __props__.__dict__["etag"] = etag
        __props__.__dict__["name"] = name
        return FieldLevelEncryptionProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="callerReference")
    def caller_reference(self) -> pulumi.Output[str]:
        """
        Internal value used by CloudFront to allow future updates to the Field Level Encryption Profile.
        """
        return pulumi.get(self, "caller_reference")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        An optional comment about the Field Level Encryption Profile.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="encryptionEntities")
    def encryption_entities(self) -> pulumi.Output['outputs.FieldLevelEncryptionProfileEncryptionEntities']:
        """
        The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
        """
        return pulumi.get(self, "encryption_entities")

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        """
        The current version of the Field Level Encryption Profile. For example: `E2QWRUHAPOMQZL`.
        """
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Field Level Encryption Profile.
        """
        return pulumi.get(self, "name")

