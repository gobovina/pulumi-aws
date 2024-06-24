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

__all__ = ['DomainArgs', 'Domain']

@pulumi.input_type
class DomainArgs:
    def __init__(__self__, *,
                 default_expiration_days: pulumi.Input[int],
                 domain_name: pulumi.Input[str],
                 dead_letter_queue_url: Optional[pulumi.Input[str]] = None,
                 default_encryption_key: Optional[pulumi.Input[str]] = None,
                 matching: Optional[pulumi.Input['DomainMatchingArgs']] = None,
                 rule_based_matching: Optional[pulumi.Input['DomainRuleBasedMatchingArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Domain resource.
        :param pulumi.Input[int] default_expiration_days: The default number of days until the data within the domain expires.
               
               The following arguments are optional:
        :param pulumi.Input[str] domain_name: The name for your Customer Profile domain. It must be unique for your AWS account.
        :param pulumi.Input[str] dead_letter_queue_url: The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from third party applications.
        :param pulumi.Input[str] default_encryption_key: The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
        :param pulumi.Input['DomainMatchingArgs'] matching: A block that specifies the process of matching duplicate profiles. Documented below.
        :param pulumi.Input['DomainRuleBasedMatchingArgs'] rule_based_matching: A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "default_expiration_days", default_expiration_days)
        pulumi.set(__self__, "domain_name", domain_name)
        if dead_letter_queue_url is not None:
            pulumi.set(__self__, "dead_letter_queue_url", dead_letter_queue_url)
        if default_encryption_key is not None:
            pulumi.set(__self__, "default_encryption_key", default_encryption_key)
        if matching is not None:
            pulumi.set(__self__, "matching", matching)
        if rule_based_matching is not None:
            pulumi.set(__self__, "rule_based_matching", rule_based_matching)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="defaultExpirationDays")
    def default_expiration_days(self) -> pulumi.Input[int]:
        """
        The default number of days until the data within the domain expires.

        The following arguments are optional:
        """
        return pulumi.get(self, "default_expiration_days")

    @default_expiration_days.setter
    def default_expiration_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "default_expiration_days", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        The name for your Customer Profile domain. It must be unique for your AWS account.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="deadLetterQueueUrl")
    def dead_letter_queue_url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from third party applications.
        """
        return pulumi.get(self, "dead_letter_queue_url")

    @dead_letter_queue_url.setter
    def dead_letter_queue_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dead_letter_queue_url", value)

    @property
    @pulumi.getter(name="defaultEncryptionKey")
    def default_encryption_key(self) -> Optional[pulumi.Input[str]]:
        """
        The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
        """
        return pulumi.get(self, "default_encryption_key")

    @default_encryption_key.setter
    def default_encryption_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_encryption_key", value)

    @property
    @pulumi.getter
    def matching(self) -> Optional[pulumi.Input['DomainMatchingArgs']]:
        """
        A block that specifies the process of matching duplicate profiles. Documented below.
        """
        return pulumi.get(self, "matching")

    @matching.setter
    def matching(self, value: Optional[pulumi.Input['DomainMatchingArgs']]):
        pulumi.set(self, "matching", value)

    @property
    @pulumi.getter(name="ruleBasedMatching")
    def rule_based_matching(self) -> Optional[pulumi.Input['DomainRuleBasedMatchingArgs']]:
        """
        A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
        """
        return pulumi.get(self, "rule_based_matching")

    @rule_based_matching.setter
    def rule_based_matching(self, value: Optional[pulumi.Input['DomainRuleBasedMatchingArgs']]):
        pulumi.set(self, "rule_based_matching", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DomainState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 dead_letter_queue_url: Optional[pulumi.Input[str]] = None,
                 default_encryption_key: Optional[pulumi.Input[str]] = None,
                 default_expiration_days: Optional[pulumi.Input[int]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 matching: Optional[pulumi.Input['DomainMatchingArgs']] = None,
                 rule_based_matching: Optional[pulumi.Input['DomainRuleBasedMatchingArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Domain resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Customer Profiles Domain.
        :param pulumi.Input[str] dead_letter_queue_url: The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from third party applications.
        :param pulumi.Input[str] default_encryption_key: The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
        :param pulumi.Input[int] default_expiration_days: The default number of days until the data within the domain expires.
               
               The following arguments are optional:
        :param pulumi.Input[str] domain_name: The name for your Customer Profile domain. It must be unique for your AWS account.
        :param pulumi.Input['DomainMatchingArgs'] matching: A block that specifies the process of matching duplicate profiles. Documented below.
        :param pulumi.Input['DomainRuleBasedMatchingArgs'] rule_based_matching: A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if dead_letter_queue_url is not None:
            pulumi.set(__self__, "dead_letter_queue_url", dead_letter_queue_url)
        if default_encryption_key is not None:
            pulumi.set(__self__, "default_encryption_key", default_encryption_key)
        if default_expiration_days is not None:
            pulumi.set(__self__, "default_expiration_days", default_expiration_days)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if matching is not None:
            pulumi.set(__self__, "matching", matching)
        if rule_based_matching is not None:
            pulumi.set(__self__, "rule_based_matching", rule_based_matching)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the Customer Profiles Domain.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="deadLetterQueueUrl")
    def dead_letter_queue_url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from third party applications.
        """
        return pulumi.get(self, "dead_letter_queue_url")

    @dead_letter_queue_url.setter
    def dead_letter_queue_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dead_letter_queue_url", value)

    @property
    @pulumi.getter(name="defaultEncryptionKey")
    def default_encryption_key(self) -> Optional[pulumi.Input[str]]:
        """
        The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
        """
        return pulumi.get(self, "default_encryption_key")

    @default_encryption_key.setter
    def default_encryption_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_encryption_key", value)

    @property
    @pulumi.getter(name="defaultExpirationDays")
    def default_expiration_days(self) -> Optional[pulumi.Input[int]]:
        """
        The default number of days until the data within the domain expires.

        The following arguments are optional:
        """
        return pulumi.get(self, "default_expiration_days")

    @default_expiration_days.setter
    def default_expiration_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "default_expiration_days", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for your Customer Profile domain. It must be unique for your AWS account.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter
    def matching(self) -> Optional[pulumi.Input['DomainMatchingArgs']]:
        """
        A block that specifies the process of matching duplicate profiles. Documented below.
        """
        return pulumi.get(self, "matching")

    @matching.setter
    def matching(self, value: Optional[pulumi.Input['DomainMatchingArgs']]):
        pulumi.set(self, "matching", value)

    @property
    @pulumi.getter(name="ruleBasedMatching")
    def rule_based_matching(self) -> Optional[pulumi.Input['DomainRuleBasedMatchingArgs']]:
        """
        A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
        """
        return pulumi.get(self, "rule_based_matching")

    @rule_based_matching.setter
    def rule_based_matching(self, value: Optional[pulumi.Input['DomainRuleBasedMatchingArgs']]):
        pulumi.set(self, "rule_based_matching", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Domain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dead_letter_queue_url: Optional[pulumi.Input[str]] = None,
                 default_encryption_key: Optional[pulumi.Input[str]] = None,
                 default_expiration_days: Optional[pulumi.Input[int]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 matching: Optional[pulumi.Input[pulumi.InputType['DomainMatchingArgs']]] = None,
                 rule_based_matching: Optional[pulumi.Input[pulumi.InputType['DomainRuleBasedMatchingArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an Amazon Customer Profiles Domain.
        See the [Create Domain](https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateDomain.html) for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.customerprofiles.Domain("example", domain_name="example")
        ```

        ### With SQS DLQ and KMS set

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.sqs.Queue("example",
            name="example",
            policy=json.dumps({
                "Version": "2012-10-17",
                "Statement": [{
                    "Sid": "Customer Profiles SQS policy",
                    "Effect": "Allow",
                    "Action": ["sqs:SendMessage"],
                    "Resource": "*",
                    "Principal": {
                        "Service": "profile.amazonaws.com",
                    },
                }],
            }))
        example_key = aws.kms.Key("example",
            description="example",
            deletion_window_in_days=10)
        example_bucket_v2 = aws.s3.BucketV2("example",
            bucket="example",
            force_destroy=True)
        example_bucket_policy = aws.s3.BucketPolicy("example",
            bucket=example_bucket_v2.id,
            policy=pulumi.Output.json_dumps({
                "Version": "2012-10-17",
                "Statement": [{
                    "Sid": "Customer Profiles S3 policy",
                    "Effect": "Allow",
                    "Action": [
                        "s3:GetObject",
                        "s3:PutObject",
                        "s3:ListBucket",
                    ],
                    "Resource": [
                        example_bucket_v2.arn,
                        example_bucket_v2.arn.apply(lambda arn: f"{arn}/*"),
                    ],
                    "Principal": {
                        "Service": "profile.amazonaws.com",
                    },
                }],
            }))
        test = aws.customerprofiles.Domain("test",
            domain_name=example,
            dead_letter_queue_url=example.id,
            default_encryption_key=example_key.arn,
            default_expiration_days=365)
        ```

        ## Import

        Using `pulumi import`, import Amazon Customer Profiles Domain using the resource `id`. For example:

        ```sh
        $ pulumi import aws:customerprofiles/domain:Domain example e6f777be-22d0-4b40-b307-5d2720ef16b2
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dead_letter_queue_url: The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from third party applications.
        :param pulumi.Input[str] default_encryption_key: The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
        :param pulumi.Input[int] default_expiration_days: The default number of days until the data within the domain expires.
               
               The following arguments are optional:
        :param pulumi.Input[str] domain_name: The name for your Customer Profile domain. It must be unique for your AWS account.
        :param pulumi.Input[pulumi.InputType['DomainMatchingArgs']] matching: A block that specifies the process of matching duplicate profiles. Documented below.
        :param pulumi.Input[pulumi.InputType['DomainRuleBasedMatchingArgs']] rule_based_matching: A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an Amazon Customer Profiles Domain.
        See the [Create Domain](https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateDomain.html) for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.customerprofiles.Domain("example", domain_name="example")
        ```

        ### With SQS DLQ and KMS set

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.sqs.Queue("example",
            name="example",
            policy=json.dumps({
                "Version": "2012-10-17",
                "Statement": [{
                    "Sid": "Customer Profiles SQS policy",
                    "Effect": "Allow",
                    "Action": ["sqs:SendMessage"],
                    "Resource": "*",
                    "Principal": {
                        "Service": "profile.amazonaws.com",
                    },
                }],
            }))
        example_key = aws.kms.Key("example",
            description="example",
            deletion_window_in_days=10)
        example_bucket_v2 = aws.s3.BucketV2("example",
            bucket="example",
            force_destroy=True)
        example_bucket_policy = aws.s3.BucketPolicy("example",
            bucket=example_bucket_v2.id,
            policy=pulumi.Output.json_dumps({
                "Version": "2012-10-17",
                "Statement": [{
                    "Sid": "Customer Profiles S3 policy",
                    "Effect": "Allow",
                    "Action": [
                        "s3:GetObject",
                        "s3:PutObject",
                        "s3:ListBucket",
                    ],
                    "Resource": [
                        example_bucket_v2.arn,
                        example_bucket_v2.arn.apply(lambda arn: f"{arn}/*"),
                    ],
                    "Principal": {
                        "Service": "profile.amazonaws.com",
                    },
                }],
            }))
        test = aws.customerprofiles.Domain("test",
            domain_name=example,
            dead_letter_queue_url=example.id,
            default_encryption_key=example_key.arn,
            default_expiration_days=365)
        ```

        ## Import

        Using `pulumi import`, import Amazon Customer Profiles Domain using the resource `id`. For example:

        ```sh
        $ pulumi import aws:customerprofiles/domain:Domain example e6f777be-22d0-4b40-b307-5d2720ef16b2
        ```

        :param str resource_name: The name of the resource.
        :param DomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dead_letter_queue_url: Optional[pulumi.Input[str]] = None,
                 default_encryption_key: Optional[pulumi.Input[str]] = None,
                 default_expiration_days: Optional[pulumi.Input[int]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 matching: Optional[pulumi.Input[pulumi.InputType['DomainMatchingArgs']]] = None,
                 rule_based_matching: Optional[pulumi.Input[pulumi.InputType['DomainRuleBasedMatchingArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainArgs.__new__(DomainArgs)

            __props__.__dict__["dead_letter_queue_url"] = dead_letter_queue_url
            __props__.__dict__["default_encryption_key"] = default_encryption_key
            if default_expiration_days is None and not opts.urn:
                raise TypeError("Missing required property 'default_expiration_days'")
            __props__.__dict__["default_expiration_days"] = default_expiration_days
            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["matching"] = matching
            __props__.__dict__["rule_based_matching"] = rule_based_matching
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Domain, __self__).__init__(
            'aws:customerprofiles/domain:Domain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            dead_letter_queue_url: Optional[pulumi.Input[str]] = None,
            default_encryption_key: Optional[pulumi.Input[str]] = None,
            default_expiration_days: Optional[pulumi.Input[int]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            matching: Optional[pulumi.Input[pulumi.InputType['DomainMatchingArgs']]] = None,
            rule_based_matching: Optional[pulumi.Input[pulumi.InputType['DomainRuleBasedMatchingArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Domain':
        """
        Get an existing Domain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Customer Profiles Domain.
        :param pulumi.Input[str] dead_letter_queue_url: The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from third party applications.
        :param pulumi.Input[str] default_encryption_key: The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
        :param pulumi.Input[int] default_expiration_days: The default number of days until the data within the domain expires.
               
               The following arguments are optional:
        :param pulumi.Input[str] domain_name: The name for your Customer Profile domain. It must be unique for your AWS account.
        :param pulumi.Input[pulumi.InputType['DomainMatchingArgs']] matching: A block that specifies the process of matching duplicate profiles. Documented below.
        :param pulumi.Input[pulumi.InputType['DomainRuleBasedMatchingArgs']] rule_based_matching: A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainState.__new__(_DomainState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["dead_letter_queue_url"] = dead_letter_queue_url
        __props__.__dict__["default_encryption_key"] = default_encryption_key
        __props__.__dict__["default_expiration_days"] = default_expiration_days
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["matching"] = matching
        __props__.__dict__["rule_based_matching"] = rule_based_matching
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Domain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the Customer Profiles Domain.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="deadLetterQueueUrl")
    def dead_letter_queue_url(self) -> pulumi.Output[Optional[str]]:
        """
        The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from third party applications.
        """
        return pulumi.get(self, "dead_letter_queue_url")

    @property
    @pulumi.getter(name="defaultEncryptionKey")
    def default_encryption_key(self) -> pulumi.Output[Optional[str]]:
        """
        The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
        """
        return pulumi.get(self, "default_encryption_key")

    @property
    @pulumi.getter(name="defaultExpirationDays")
    def default_expiration_days(self) -> pulumi.Output[int]:
        """
        The default number of days until the data within the domain expires.

        The following arguments are optional:
        """
        return pulumi.get(self, "default_expiration_days")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        The name for your Customer Profile domain. It must be unique for your AWS account.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter
    def matching(self) -> pulumi.Output[Optional['outputs.DomainMatching']]:
        """
        A block that specifies the process of matching duplicate profiles. Documented below.
        """
        return pulumi.get(self, "matching")

    @property
    @pulumi.getter(name="ruleBasedMatching")
    def rule_based_matching(self) -> pulumi.Output[Optional['outputs.DomainRuleBasedMatching']]:
        """
        A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
        """
        return pulumi.get(self, "rule_based_matching")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Tags to apply to the domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

