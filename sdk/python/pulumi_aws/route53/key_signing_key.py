# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['KeySigningKeyArgs', 'KeySigningKey']

@pulumi.input_type
class KeySigningKeyArgs:
    def __init__(__self__, *,
                 hosted_zone_id: pulumi.Input[str],
                 key_management_service_arn: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a KeySigningKey resource.
        :param pulumi.Input[str] hosted_zone_id: Identifier of the Route 53 Hosted Zone.
        :param pulumi.Input[str] key_management_service_arn: Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
        :param pulumi.Input[str] name: Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
        :param pulumi.Input[str] status: Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
        """
        pulumi.set(__self__, "hosted_zone_id", hosted_zone_id)
        pulumi.set(__self__, "key_management_service_arn", key_management_service_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="hostedZoneId")
    def hosted_zone_id(self) -> pulumi.Input[str]:
        """
        Identifier of the Route 53 Hosted Zone.
        """
        return pulumi.get(self, "hosted_zone_id")

    @hosted_zone_id.setter
    def hosted_zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "hosted_zone_id", value)

    @property
    @pulumi.getter(name="keyManagementServiceArn")
    def key_management_service_arn(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
        """
        return pulumi.get(self, "key_management_service_arn")

    @key_management_service_arn.setter
    def key_management_service_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_management_service_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _KeySigningKeyState:
    def __init__(__self__, *,
                 digest_algorithm_mnemonic: Optional[pulumi.Input[str]] = None,
                 digest_algorithm_type: Optional[pulumi.Input[int]] = None,
                 digest_value: Optional[pulumi.Input[str]] = None,
                 dnskey_record: Optional[pulumi.Input[str]] = None,
                 ds_record: Optional[pulumi.Input[str]] = None,
                 flag: Optional[pulumi.Input[int]] = None,
                 hosted_zone_id: Optional[pulumi.Input[str]] = None,
                 key_management_service_arn: Optional[pulumi.Input[str]] = None,
                 key_tag: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None,
                 signing_algorithm_mnemonic: Optional[pulumi.Input[str]] = None,
                 signing_algorithm_type: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KeySigningKey resources.
        :param pulumi.Input[str] digest_algorithm_mnemonic: A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
        :param pulumi.Input[int] digest_algorithm_type: An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
        :param pulumi.Input[str] digest_value: A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
        :param pulumi.Input[str] dnskey_record: A string that represents a DNSKEY record.
        :param pulumi.Input[str] ds_record: A string that represents a delegation signer (DS) record.
        :param pulumi.Input[int] flag: An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
        :param pulumi.Input[str] hosted_zone_id: Identifier of the Route 53 Hosted Zone.
        :param pulumi.Input[str] key_management_service_arn: Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
        :param pulumi.Input[int] key_tag: An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in [RFC-4034 Appendix B](https://tools.ietf.org/rfc/rfc4034.txt).
        :param pulumi.Input[str] name: Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
        :param pulumi.Input[str] public_key: The public key, represented as a Base64 encoding, as required by [RFC-4034 Page 5](https://tools.ietf.org/rfc/rfc4034.txt).
        :param pulumi.Input[str] signing_algorithm_mnemonic: A string used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
        :param pulumi.Input[int] signing_algorithm_type: An integer used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
        :param pulumi.Input[str] status: Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
        """
        if digest_algorithm_mnemonic is not None:
            pulumi.set(__self__, "digest_algorithm_mnemonic", digest_algorithm_mnemonic)
        if digest_algorithm_type is not None:
            pulumi.set(__self__, "digest_algorithm_type", digest_algorithm_type)
        if digest_value is not None:
            pulumi.set(__self__, "digest_value", digest_value)
        if dnskey_record is not None:
            pulumi.set(__self__, "dnskey_record", dnskey_record)
        if ds_record is not None:
            pulumi.set(__self__, "ds_record", ds_record)
        if flag is not None:
            pulumi.set(__self__, "flag", flag)
        if hosted_zone_id is not None:
            pulumi.set(__self__, "hosted_zone_id", hosted_zone_id)
        if key_management_service_arn is not None:
            pulumi.set(__self__, "key_management_service_arn", key_management_service_arn)
        if key_tag is not None:
            pulumi.set(__self__, "key_tag", key_tag)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if public_key is not None:
            pulumi.set(__self__, "public_key", public_key)
        if signing_algorithm_mnemonic is not None:
            pulumi.set(__self__, "signing_algorithm_mnemonic", signing_algorithm_mnemonic)
        if signing_algorithm_type is not None:
            pulumi.set(__self__, "signing_algorithm_type", signing_algorithm_type)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="digestAlgorithmMnemonic")
    def digest_algorithm_mnemonic(self) -> Optional[pulumi.Input[str]]:
        """
        A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
        """
        return pulumi.get(self, "digest_algorithm_mnemonic")

    @digest_algorithm_mnemonic.setter
    def digest_algorithm_mnemonic(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "digest_algorithm_mnemonic", value)

    @property
    @pulumi.getter(name="digestAlgorithmType")
    def digest_algorithm_type(self) -> Optional[pulumi.Input[int]]:
        """
        An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
        """
        return pulumi.get(self, "digest_algorithm_type")

    @digest_algorithm_type.setter
    def digest_algorithm_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "digest_algorithm_type", value)

    @property
    @pulumi.getter(name="digestValue")
    def digest_value(self) -> Optional[pulumi.Input[str]]:
        """
        A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
        """
        return pulumi.get(self, "digest_value")

    @digest_value.setter
    def digest_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "digest_value", value)

    @property
    @pulumi.getter(name="dnskeyRecord")
    def dnskey_record(self) -> Optional[pulumi.Input[str]]:
        """
        A string that represents a DNSKEY record.
        """
        return pulumi.get(self, "dnskey_record")

    @dnskey_record.setter
    def dnskey_record(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dnskey_record", value)

    @property
    @pulumi.getter(name="dsRecord")
    def ds_record(self) -> Optional[pulumi.Input[str]]:
        """
        A string that represents a delegation signer (DS) record.
        """
        return pulumi.get(self, "ds_record")

    @ds_record.setter
    def ds_record(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ds_record", value)

    @property
    @pulumi.getter
    def flag(self) -> Optional[pulumi.Input[int]]:
        """
        An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
        """
        return pulumi.get(self, "flag")

    @flag.setter
    def flag(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "flag", value)

    @property
    @pulumi.getter(name="hostedZoneId")
    def hosted_zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the Route 53 Hosted Zone.
        """
        return pulumi.get(self, "hosted_zone_id")

    @hosted_zone_id.setter
    def hosted_zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hosted_zone_id", value)

    @property
    @pulumi.getter(name="keyManagementServiceArn")
    def key_management_service_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
        """
        return pulumi.get(self, "key_management_service_arn")

    @key_management_service_arn.setter
    def key_management_service_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_management_service_arn", value)

    @property
    @pulumi.getter(name="keyTag")
    def key_tag(self) -> Optional[pulumi.Input[int]]:
        """
        An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in [RFC-4034 Appendix B](https://tools.ietf.org/rfc/rfc4034.txt).
        """
        return pulumi.get(self, "key_tag")

    @key_tag.setter
    def key_tag(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "key_tag", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> Optional[pulumi.Input[str]]:
        """
        The public key, represented as a Base64 encoding, as required by [RFC-4034 Page 5](https://tools.ietf.org/rfc/rfc4034.txt).
        """
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_key", value)

    @property
    @pulumi.getter(name="signingAlgorithmMnemonic")
    def signing_algorithm_mnemonic(self) -> Optional[pulumi.Input[str]]:
        """
        A string used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
        """
        return pulumi.get(self, "signing_algorithm_mnemonic")

    @signing_algorithm_mnemonic.setter
    def signing_algorithm_mnemonic(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signing_algorithm_mnemonic", value)

    @property
    @pulumi.getter(name="signingAlgorithmType")
    def signing_algorithm_type(self) -> Optional[pulumi.Input[int]]:
        """
        An integer used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
        """
        return pulumi.get(self, "signing_algorithm_type")

    @signing_algorithm_type.setter
    def signing_algorithm_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "signing_algorithm_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class KeySigningKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hosted_zone_id: Optional[pulumi.Input[str]] = None,
                 key_management_service_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Route 53 Key Signing Key. To manage Domain Name System Security Extensions (DNSSEC) for a Hosted Zone, see the `route53.HostedZoneDnsSec` resource. For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html).

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example_key = aws.kms.Key("exampleKey",
            customer_master_key_spec="ECC_NIST_P256",
            deletion_window_in_days=7,
            key_usage="SIGN_VERIFY",
            policy=json.dumps({
                "Statement": [
                    {
                        "Action": [
                            "kms:DescribeKey",
                            "kms:GetPublicKey",
                            "kms:Sign",
                        ],
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "api-service.dnssec.route53.aws.internal",
                        },
                        "Sid": "Route 53 DNSSEC Permissions",
                    },
                    {
                        "Action": "kms:*",
                        "Effect": "Allow",
                        "Principal": {
                            "AWS": "*",
                        },
                        "Resource": "*",
                        "Sid": "IAM User Permissions",
                    },
                ],
                "Version": "2012-10-17",
            }))
        example_zone = aws.route53.Zone("exampleZone")
        example_key_signing_key = aws.route53.KeySigningKey("exampleKeySigningKey",
            hosted_zone_id=aws_route53_zone["test"]["id"],
            key_management_service_arn=aws_kms_key["test"]["arn"])
        example_hosted_zone_dns_sec = aws.route53.HostedZoneDnsSec("exampleHostedZoneDnsSec", hosted_zone_id=example_key_signing_key.hosted_zone_id)
        ```

        ## Import

        `aws_route53_key_signing_key` resources can be imported by using the Route 53 Hosted Zone identifier and KMS Key identifier, separated by a comma (`,`), e.g.

        ```sh
         $ pulumi import aws:route53/keySigningKey:KeySigningKey example Z1D633PJN98FT9,example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hosted_zone_id: Identifier of the Route 53 Hosted Zone.
        :param pulumi.Input[str] key_management_service_arn: Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
        :param pulumi.Input[str] name: Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
        :param pulumi.Input[str] status: Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KeySigningKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Route 53 Key Signing Key. To manage Domain Name System Security Extensions (DNSSEC) for a Hosted Zone, see the `route53.HostedZoneDnsSec` resource. For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html).

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example_key = aws.kms.Key("exampleKey",
            customer_master_key_spec="ECC_NIST_P256",
            deletion_window_in_days=7,
            key_usage="SIGN_VERIFY",
            policy=json.dumps({
                "Statement": [
                    {
                        "Action": [
                            "kms:DescribeKey",
                            "kms:GetPublicKey",
                            "kms:Sign",
                        ],
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "api-service.dnssec.route53.aws.internal",
                        },
                        "Sid": "Route 53 DNSSEC Permissions",
                    },
                    {
                        "Action": "kms:*",
                        "Effect": "Allow",
                        "Principal": {
                            "AWS": "*",
                        },
                        "Resource": "*",
                        "Sid": "IAM User Permissions",
                    },
                ],
                "Version": "2012-10-17",
            }))
        example_zone = aws.route53.Zone("exampleZone")
        example_key_signing_key = aws.route53.KeySigningKey("exampleKeySigningKey",
            hosted_zone_id=aws_route53_zone["test"]["id"],
            key_management_service_arn=aws_kms_key["test"]["arn"])
        example_hosted_zone_dns_sec = aws.route53.HostedZoneDnsSec("exampleHostedZoneDnsSec", hosted_zone_id=example_key_signing_key.hosted_zone_id)
        ```

        ## Import

        `aws_route53_key_signing_key` resources can be imported by using the Route 53 Hosted Zone identifier and KMS Key identifier, separated by a comma (`,`), e.g.

        ```sh
         $ pulumi import aws:route53/keySigningKey:KeySigningKey example Z1D633PJN98FT9,example
        ```

        :param str resource_name: The name of the resource.
        :param KeySigningKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KeySigningKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hosted_zone_id: Optional[pulumi.Input[str]] = None,
                 key_management_service_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KeySigningKeyArgs.__new__(KeySigningKeyArgs)

            if hosted_zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'hosted_zone_id'")
            __props__.__dict__["hosted_zone_id"] = hosted_zone_id
            if key_management_service_arn is None and not opts.urn:
                raise TypeError("Missing required property 'key_management_service_arn'")
            __props__.__dict__["key_management_service_arn"] = key_management_service_arn
            __props__.__dict__["name"] = name
            __props__.__dict__["status"] = status
            __props__.__dict__["digest_algorithm_mnemonic"] = None
            __props__.__dict__["digest_algorithm_type"] = None
            __props__.__dict__["digest_value"] = None
            __props__.__dict__["dnskey_record"] = None
            __props__.__dict__["ds_record"] = None
            __props__.__dict__["flag"] = None
            __props__.__dict__["key_tag"] = None
            __props__.__dict__["public_key"] = None
            __props__.__dict__["signing_algorithm_mnemonic"] = None
            __props__.__dict__["signing_algorithm_type"] = None
        super(KeySigningKey, __self__).__init__(
            'aws:route53/keySigningKey:KeySigningKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            digest_algorithm_mnemonic: Optional[pulumi.Input[str]] = None,
            digest_algorithm_type: Optional[pulumi.Input[int]] = None,
            digest_value: Optional[pulumi.Input[str]] = None,
            dnskey_record: Optional[pulumi.Input[str]] = None,
            ds_record: Optional[pulumi.Input[str]] = None,
            flag: Optional[pulumi.Input[int]] = None,
            hosted_zone_id: Optional[pulumi.Input[str]] = None,
            key_management_service_arn: Optional[pulumi.Input[str]] = None,
            key_tag: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            public_key: Optional[pulumi.Input[str]] = None,
            signing_algorithm_mnemonic: Optional[pulumi.Input[str]] = None,
            signing_algorithm_type: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'KeySigningKey':
        """
        Get an existing KeySigningKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] digest_algorithm_mnemonic: A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
        :param pulumi.Input[int] digest_algorithm_type: An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
        :param pulumi.Input[str] digest_value: A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
        :param pulumi.Input[str] dnskey_record: A string that represents a DNSKEY record.
        :param pulumi.Input[str] ds_record: A string that represents a delegation signer (DS) record.
        :param pulumi.Input[int] flag: An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
        :param pulumi.Input[str] hosted_zone_id: Identifier of the Route 53 Hosted Zone.
        :param pulumi.Input[str] key_management_service_arn: Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
        :param pulumi.Input[int] key_tag: An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in [RFC-4034 Appendix B](https://tools.ietf.org/rfc/rfc4034.txt).
        :param pulumi.Input[str] name: Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
        :param pulumi.Input[str] public_key: The public key, represented as a Base64 encoding, as required by [RFC-4034 Page 5](https://tools.ietf.org/rfc/rfc4034.txt).
        :param pulumi.Input[str] signing_algorithm_mnemonic: A string used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
        :param pulumi.Input[int] signing_algorithm_type: An integer used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
        :param pulumi.Input[str] status: Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KeySigningKeyState.__new__(_KeySigningKeyState)

        __props__.__dict__["digest_algorithm_mnemonic"] = digest_algorithm_mnemonic
        __props__.__dict__["digest_algorithm_type"] = digest_algorithm_type
        __props__.__dict__["digest_value"] = digest_value
        __props__.__dict__["dnskey_record"] = dnskey_record
        __props__.__dict__["ds_record"] = ds_record
        __props__.__dict__["flag"] = flag
        __props__.__dict__["hosted_zone_id"] = hosted_zone_id
        __props__.__dict__["key_management_service_arn"] = key_management_service_arn
        __props__.__dict__["key_tag"] = key_tag
        __props__.__dict__["name"] = name
        __props__.__dict__["public_key"] = public_key
        __props__.__dict__["signing_algorithm_mnemonic"] = signing_algorithm_mnemonic
        __props__.__dict__["signing_algorithm_type"] = signing_algorithm_type
        __props__.__dict__["status"] = status
        return KeySigningKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="digestAlgorithmMnemonic")
    def digest_algorithm_mnemonic(self) -> pulumi.Output[str]:
        """
        A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
        """
        return pulumi.get(self, "digest_algorithm_mnemonic")

    @property
    @pulumi.getter(name="digestAlgorithmType")
    def digest_algorithm_type(self) -> pulumi.Output[int]:
        """
        An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
        """
        return pulumi.get(self, "digest_algorithm_type")

    @property
    @pulumi.getter(name="digestValue")
    def digest_value(self) -> pulumi.Output[str]:
        """
        A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
        """
        return pulumi.get(self, "digest_value")

    @property
    @pulumi.getter(name="dnskeyRecord")
    def dnskey_record(self) -> pulumi.Output[str]:
        """
        A string that represents a DNSKEY record.
        """
        return pulumi.get(self, "dnskey_record")

    @property
    @pulumi.getter(name="dsRecord")
    def ds_record(self) -> pulumi.Output[str]:
        """
        A string that represents a delegation signer (DS) record.
        """
        return pulumi.get(self, "ds_record")

    @property
    @pulumi.getter
    def flag(self) -> pulumi.Output[int]:
        """
        An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
        """
        return pulumi.get(self, "flag")

    @property
    @pulumi.getter(name="hostedZoneId")
    def hosted_zone_id(self) -> pulumi.Output[str]:
        """
        Identifier of the Route 53 Hosted Zone.
        """
        return pulumi.get(self, "hosted_zone_id")

    @property
    @pulumi.getter(name="keyManagementServiceArn")
    def key_management_service_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
        """
        return pulumi.get(self, "key_management_service_arn")

    @property
    @pulumi.getter(name="keyTag")
    def key_tag(self) -> pulumi.Output[int]:
        """
        An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in [RFC-4034 Appendix B](https://tools.ietf.org/rfc/rfc4034.txt).
        """
        return pulumi.get(self, "key_tag")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Output[str]:
        """
        The public key, represented as a Base64 encoding, as required by [RFC-4034 Page 5](https://tools.ietf.org/rfc/rfc4034.txt).
        """
        return pulumi.get(self, "public_key")

    @property
    @pulumi.getter(name="signingAlgorithmMnemonic")
    def signing_algorithm_mnemonic(self) -> pulumi.Output[str]:
        """
        A string used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
        """
        return pulumi.get(self, "signing_algorithm_mnemonic")

    @property
    @pulumi.getter(name="signingAlgorithmType")
    def signing_algorithm_type(self) -> pulumi.Output[int]:
        """
        An integer used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
        """
        return pulumi.get(self, "signing_algorithm_type")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
        """
        return pulumi.get(self, "status")

