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

__all__ = [
    'GetPolicyDocumentResult',
    'AwaitableGetPolicyDocumentResult',
    'get_policy_document',
    'get_policy_document_output',
]

@pulumi.output_type
class GetPolicyDocumentResult:
    """
    A collection of values returned by getPolicyDocument.
    """
    def __init__(__self__, id=None, json=None, minified_json=None, override_json=None, override_policy_documents=None, policy_id=None, source_json=None, source_policy_documents=None, statements=None, version=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)
        if minified_json and not isinstance(minified_json, str):
            raise TypeError("Expected argument 'minified_json' to be a str")
        pulumi.set(__self__, "minified_json", minified_json)
        if override_json and not isinstance(override_json, str):
            raise TypeError("Expected argument 'override_json' to be a str")
        pulumi.set(__self__, "override_json", override_json)
        if override_policy_documents and not isinstance(override_policy_documents, list):
            raise TypeError("Expected argument 'override_policy_documents' to be a list")
        pulumi.set(__self__, "override_policy_documents", override_policy_documents)
        if policy_id and not isinstance(policy_id, str):
            raise TypeError("Expected argument 'policy_id' to be a str")
        pulumi.set(__self__, "policy_id", policy_id)
        if source_json and not isinstance(source_json, str):
            raise TypeError("Expected argument 'source_json' to be a str")
        pulumi.set(__self__, "source_json", source_json)
        if source_policy_documents and not isinstance(source_policy_documents, list):
            raise TypeError("Expected argument 'source_policy_documents' to be a list")
        pulumi.set(__self__, "source_policy_documents", source_policy_documents)
        if statements and not isinstance(statements, list):
            raise TypeError("Expected argument 'statements' to be a list")
        pulumi.set(__self__, "statements", statements)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> str:
        """
        Standard JSON policy document rendered based on the arguments above.
        """
        return pulumi.get(self, "json")

    @property
    @pulumi.getter(name="minifiedJson")
    def minified_json(self) -> str:
        """
        Minified JSON policy document rendered based on the arguments above.
        """
        return pulumi.get(self, "minified_json")

    @property
    @pulumi.getter(name="overrideJson")
    @_utilities.deprecated("""Not used""")
    def override_json(self) -> Optional[str]:
        return pulumi.get(self, "override_json")

    @property
    @pulumi.getter(name="overridePolicyDocuments")
    def override_policy_documents(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "override_policy_documents")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[str]:
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="sourceJson")
    @_utilities.deprecated("""Not used""")
    def source_json(self) -> Optional[str]:
        return pulumi.get(self, "source_json")

    @property
    @pulumi.getter(name="sourcePolicyDocuments")
    def source_policy_documents(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "source_policy_documents")

    @property
    @pulumi.getter
    def statements(self) -> Optional[Sequence['outputs.GetPolicyDocumentStatementResult']]:
        return pulumi.get(self, "statements")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        return pulumi.get(self, "version")


class AwaitableGetPolicyDocumentResult(GetPolicyDocumentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPolicyDocumentResult(
            id=self.id,
            json=self.json,
            minified_json=self.minified_json,
            override_json=self.override_json,
            override_policy_documents=self.override_policy_documents,
            policy_id=self.policy_id,
            source_json=self.source_json,
            source_policy_documents=self.source_policy_documents,
            statements=self.statements,
            version=self.version)


def get_policy_document(override_json: Optional[str] = None,
                        override_policy_documents: Optional[Sequence[str]] = None,
                        policy_id: Optional[str] = None,
                        source_json: Optional[str] = None,
                        source_policy_documents: Optional[Sequence[str]] = None,
                        statements: Optional[Sequence[pulumi.InputType['GetPolicyDocumentStatementArgs']]] = None,
                        version: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPolicyDocumentResult:
    """
    Generates an IAM policy document in JSON format for use with resources that expect policy documents such as `iam.Policy`.

    Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.

    ## Example Usage

    ### Basic Example

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="1",
            actions=[
                "s3:ListAllMyBuckets",
                "s3:GetBucketLocation",
            ],
            resources=["arn:aws:s3:::*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["s3:ListBucket"],
            resources=[f"arn:aws:s3:::{s3_bucket_name}"],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="StringLike",
                variable="s3:prefix",
                values=[
                    "",
                    "home/",
                    "home/&{aws:username}/",
                ],
            )],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["s3:*"],
            resources=[
                f"arn:aws:s3:::{s3_bucket_name}/home/&{{aws:username}}",
                f"arn:aws:s3:::{s3_bucket_name}/home/&{{aws:username}}/*",
            ],
        ),
    ])
    example_policy = aws.iam.Policy("example",
        name="example_policy",
        path="/",
        policy=example.json)
    ```

    ### Example Multiple Condition Keys and Values

    You can specify a [condition with multiple keys and values](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_multi-value-conditions.html) by supplying multiple `condition` blocks with the same `test` value, but differing `variable` and `values` values.

    ```python
    import pulumi
    import pulumi_aws as aws

    example_multiple_condition_keys_and_values = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        actions=[
            "kms:Decrypt",
            "kms:GenerateDataKey",
        ],
        resources=["*"],
        conditions=[
            aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ForAnyValue:StringEquals",
                variable="kms:EncryptionContext:service",
                values=["pi"],
            ),
            aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ForAnyValue:StringEquals",
                variable="kms:EncryptionContext:aws:pi:service",
                values=["rds"],
            ),
            aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ForAnyValue:StringEquals",
                variable="kms:EncryptionContext:aws:rds:db-id",
                values=[
                    "db-AAAAABBBBBCCCCCDDDDDEEEEE",
                    "db-EEEEEDDDDDCCCCCBBBBBAAAAA",
                ],
            ),
        ],
    )])
    ```

    `data.aws_iam_policy_document.example_multiple_condition_keys_and_values.json` will evaluate to:

    ### Example Assume-Role Policy with Multiple Principals

    You can specify multiple principal blocks with different types. You can also use this data source to generate an assume-role policy.

    ```python
    import pulumi
    import pulumi_aws as aws

    event_stream_bucket_role_assume_role_policy = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        actions=["sts:AssumeRole"],
        principals=[
            aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["firehose.amazonaws.com"],
            ),
            aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[trusted_role_arn],
            ),
            aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Federated",
                identifiers=[
                    f"arn:aws:iam::{account_id}:saml-provider/{provider_name}",
                    "cognito-identity.amazonaws.com",
                ],
            ),
        ],
    )])
    ```

    ### Example Using A Source Document

    ```python
    import pulumi
    import pulumi_aws as aws

    source = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["ec2:*"],
            resources=["*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="SidToOverride",
            actions=["s3:*"],
            resources=["*"],
        ),
    ])
    source_document_example = aws.iam.get_policy_document(source_policy_documents=[source.json],
        statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="SidToOverride",
            actions=["s3:*"],
            resources=[
                "arn:aws:s3:::somebucket",
                "arn:aws:s3:::somebucket/*",
            ],
        )])
    ```

    `data.aws_iam_policy_document.source_document_example.json` will evaluate to:

    ### Example Using An Override Document

    ```python
    import pulumi
    import pulumi_aws as aws

    override = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="SidToOverride",
        actions=["s3:*"],
        resources=["*"],
    )])
    override_policy_document_example = aws.iam.get_policy_document(override_policy_documents=[override.json],
        statements=[
            aws.iam.GetPolicyDocumentStatementArgs(
                actions=["ec2:*"],
                resources=["*"],
            ),
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="SidToOverride",
                actions=["s3:*"],
                resources=[
                    "arn:aws:s3:::somebucket",
                    "arn:aws:s3:::somebucket/*",
                ],
            ),
        ])
    ```

    `data.aws_iam_policy_document.override_policy_document_example.json` will evaluate to:

    ### Example with Both Source and Override Documents

    You can also combine `source_policy_documents` and `override_policy_documents` in the same document.

    ```python
    import pulumi
    import pulumi_aws as aws

    source = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="OverridePlaceholder",
        actions=["ec2:DescribeAccountAttributes"],
        resources=["*"],
    )])
    override = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="OverridePlaceholder",
        actions=["s3:GetObject"],
        resources=["*"],
    )])
    politik = aws.iam.get_policy_document(source_policy_documents=[source.json],
        override_policy_documents=[override.json])
    ```

    `data.aws_iam_policy_document.politik.json` will evaluate to:

    ### Example of Merging Source Documents

    Multiple documents can be combined using the `source_policy_documents` or `override_policy_documents` attributes. `source_policy_documents` requires that all documents have unique Sids, while `override_policy_documents` will iteratively override matching Sids.

    ```python
    import pulumi
    import pulumi_aws as aws

    source_one = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["ec2:*"],
            resources=["*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="UniqueSidOne",
            actions=["s3:*"],
            resources=["*"],
        ),
    ])
    source_two = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="UniqueSidTwo",
            actions=["iam:*"],
            resources=["*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["lambda:*"],
            resources=["*"],
        ),
    ])
    combined = aws.iam.get_policy_document(source_policy_documents=[
        source_one.json,
        source_two.json,
    ])
    ```

    `data.aws_iam_policy_document.combined.json` will evaluate to:

    ### Example of Merging Override Documents

    ```python
    import pulumi
    import pulumi_aws as aws

    policy_one = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="OverridePlaceHolderOne",
        effect="Allow",
        actions=["s3:*"],
        resources=["*"],
    )])
    policy_two = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["ec2:*"],
            resources=["*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="OverridePlaceHolderTwo",
            effect="Allow",
            actions=["iam:*"],
            resources=["*"],
        ),
    ])
    policy_three = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="OverridePlaceHolderOne",
        effect="Deny",
        actions=["logs:*"],
        resources=["*"],
    )])
    combined = aws.iam.get_policy_document(override_policy_documents=[
            policy_one.json,
            policy_two.json,
            policy_three.json,
        ],
        statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="OverridePlaceHolderTwo",
            effect="Deny",
            actions=["*"],
            resources=["*"],
        )])
    ```

    `data.aws_iam_policy_document.combined.json` will evaluate to:


    :param Sequence[str] override_policy_documents: List of IAM policy documents that are merged together into the exported document. In merging, statements with non-blank `sid`s will override statements with the same `sid` from earlier documents in the list. Statements with non-blank `sid`s will also override statements with the same `sid` from `source_policy_documents`.  Non-overriding statements will be added to the exported document.
    :param str policy_id: ID for the policy document.
    :param Sequence[str] source_policy_documents: List of IAM policy documents that are merged together into the exported document. Statements defined in `source_policy_documents` must have unique `sid`s. Statements with the same `sid` from `override_policy_documents` will override source statements.
    :param Sequence[pulumi.InputType['GetPolicyDocumentStatementArgs']] statements: Configuration block for a policy statement. Detailed below.
    :param str version: IAM policy document version. Valid values are `2008-10-17` and `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
    """
    __args__ = dict()
    __args__['overrideJson'] = override_json
    __args__['overridePolicyDocuments'] = override_policy_documents
    __args__['policyId'] = policy_id
    __args__['sourceJson'] = source_json
    __args__['sourcePolicyDocuments'] = source_policy_documents
    __args__['statements'] = statements
    __args__['version'] = version
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:iam/getPolicyDocument:getPolicyDocument', __args__, opts=opts, typ=GetPolicyDocumentResult).value

    return AwaitableGetPolicyDocumentResult(
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'),
        minified_json=pulumi.get(__ret__, 'minified_json'),
        override_json=pulumi.get(__ret__, 'override_json'),
        override_policy_documents=pulumi.get(__ret__, 'override_policy_documents'),
        policy_id=pulumi.get(__ret__, 'policy_id'),
        source_json=pulumi.get(__ret__, 'source_json'),
        source_policy_documents=pulumi.get(__ret__, 'source_policy_documents'),
        statements=pulumi.get(__ret__, 'statements'),
        version=pulumi.get(__ret__, 'version'))


@_utilities.lift_output_func(get_policy_document)
def get_policy_document_output(override_json: Optional[pulumi.Input[Optional[str]]] = None,
                               override_policy_documents: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               policy_id: Optional[pulumi.Input[Optional[str]]] = None,
                               source_json: Optional[pulumi.Input[Optional[str]]] = None,
                               source_policy_documents: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               statements: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetPolicyDocumentStatementArgs']]]]] = None,
                               version: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPolicyDocumentResult]:
    """
    Generates an IAM policy document in JSON format for use with resources that expect policy documents such as `iam.Policy`.

    Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.

    ## Example Usage

    ### Basic Example

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="1",
            actions=[
                "s3:ListAllMyBuckets",
                "s3:GetBucketLocation",
            ],
            resources=["arn:aws:s3:::*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["s3:ListBucket"],
            resources=[f"arn:aws:s3:::{s3_bucket_name}"],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="StringLike",
                variable="s3:prefix",
                values=[
                    "",
                    "home/",
                    "home/&{aws:username}/",
                ],
            )],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["s3:*"],
            resources=[
                f"arn:aws:s3:::{s3_bucket_name}/home/&{{aws:username}}",
                f"arn:aws:s3:::{s3_bucket_name}/home/&{{aws:username}}/*",
            ],
        ),
    ])
    example_policy = aws.iam.Policy("example",
        name="example_policy",
        path="/",
        policy=example.json)
    ```

    ### Example Multiple Condition Keys and Values

    You can specify a [condition with multiple keys and values](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_multi-value-conditions.html) by supplying multiple `condition` blocks with the same `test` value, but differing `variable` and `values` values.

    ```python
    import pulumi
    import pulumi_aws as aws

    example_multiple_condition_keys_and_values = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        actions=[
            "kms:Decrypt",
            "kms:GenerateDataKey",
        ],
        resources=["*"],
        conditions=[
            aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ForAnyValue:StringEquals",
                variable="kms:EncryptionContext:service",
                values=["pi"],
            ),
            aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ForAnyValue:StringEquals",
                variable="kms:EncryptionContext:aws:pi:service",
                values=["rds"],
            ),
            aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="ForAnyValue:StringEquals",
                variable="kms:EncryptionContext:aws:rds:db-id",
                values=[
                    "db-AAAAABBBBBCCCCCDDDDDEEEEE",
                    "db-EEEEEDDDDDCCCCCBBBBBAAAAA",
                ],
            ),
        ],
    )])
    ```

    `data.aws_iam_policy_document.example_multiple_condition_keys_and_values.json` will evaluate to:

    ### Example Assume-Role Policy with Multiple Principals

    You can specify multiple principal blocks with different types. You can also use this data source to generate an assume-role policy.

    ```python
    import pulumi
    import pulumi_aws as aws

    event_stream_bucket_role_assume_role_policy = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        actions=["sts:AssumeRole"],
        principals=[
            aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Service",
                identifiers=["firehose.amazonaws.com"],
            ),
            aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[trusted_role_arn],
            ),
            aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="Federated",
                identifiers=[
                    f"arn:aws:iam::{account_id}:saml-provider/{provider_name}",
                    "cognito-identity.amazonaws.com",
                ],
            ),
        ],
    )])
    ```

    ### Example Using A Source Document

    ```python
    import pulumi
    import pulumi_aws as aws

    source = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["ec2:*"],
            resources=["*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="SidToOverride",
            actions=["s3:*"],
            resources=["*"],
        ),
    ])
    source_document_example = aws.iam.get_policy_document(source_policy_documents=[source.json],
        statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="SidToOverride",
            actions=["s3:*"],
            resources=[
                "arn:aws:s3:::somebucket",
                "arn:aws:s3:::somebucket/*",
            ],
        )])
    ```

    `data.aws_iam_policy_document.source_document_example.json` will evaluate to:

    ### Example Using An Override Document

    ```python
    import pulumi
    import pulumi_aws as aws

    override = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="SidToOverride",
        actions=["s3:*"],
        resources=["*"],
    )])
    override_policy_document_example = aws.iam.get_policy_document(override_policy_documents=[override.json],
        statements=[
            aws.iam.GetPolicyDocumentStatementArgs(
                actions=["ec2:*"],
                resources=["*"],
            ),
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="SidToOverride",
                actions=["s3:*"],
                resources=[
                    "arn:aws:s3:::somebucket",
                    "arn:aws:s3:::somebucket/*",
                ],
            ),
        ])
    ```

    `data.aws_iam_policy_document.override_policy_document_example.json` will evaluate to:

    ### Example with Both Source and Override Documents

    You can also combine `source_policy_documents` and `override_policy_documents` in the same document.

    ```python
    import pulumi
    import pulumi_aws as aws

    source = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="OverridePlaceholder",
        actions=["ec2:DescribeAccountAttributes"],
        resources=["*"],
    )])
    override = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="OverridePlaceholder",
        actions=["s3:GetObject"],
        resources=["*"],
    )])
    politik = aws.iam.get_policy_document(source_policy_documents=[source.json],
        override_policy_documents=[override.json])
    ```

    `data.aws_iam_policy_document.politik.json` will evaluate to:

    ### Example of Merging Source Documents

    Multiple documents can be combined using the `source_policy_documents` or `override_policy_documents` attributes. `source_policy_documents` requires that all documents have unique Sids, while `override_policy_documents` will iteratively override matching Sids.

    ```python
    import pulumi
    import pulumi_aws as aws

    source_one = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["ec2:*"],
            resources=["*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="UniqueSidOne",
            actions=["s3:*"],
            resources=["*"],
        ),
    ])
    source_two = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="UniqueSidTwo",
            actions=["iam:*"],
            resources=["*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            actions=["lambda:*"],
            resources=["*"],
        ),
    ])
    combined = aws.iam.get_policy_document(source_policy_documents=[
        source_one.json,
        source_two.json,
    ])
    ```

    `data.aws_iam_policy_document.combined.json` will evaluate to:

    ### Example of Merging Override Documents

    ```python
    import pulumi
    import pulumi_aws as aws

    policy_one = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="OverridePlaceHolderOne",
        effect="Allow",
        actions=["s3:*"],
        resources=["*"],
    )])
    policy_two = aws.iam.get_policy_document(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            effect="Allow",
            actions=["ec2:*"],
            resources=["*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="OverridePlaceHolderTwo",
            effect="Allow",
            actions=["iam:*"],
            resources=["*"],
        ),
    ])
    policy_three = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="OverridePlaceHolderOne",
        effect="Deny",
        actions=["logs:*"],
        resources=["*"],
    )])
    combined = aws.iam.get_policy_document(override_policy_documents=[
            policy_one.json,
            policy_two.json,
            policy_three.json,
        ],
        statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="OverridePlaceHolderTwo",
            effect="Deny",
            actions=["*"],
            resources=["*"],
        )])
    ```

    `data.aws_iam_policy_document.combined.json` will evaluate to:


    :param Sequence[str] override_policy_documents: List of IAM policy documents that are merged together into the exported document. In merging, statements with non-blank `sid`s will override statements with the same `sid` from earlier documents in the list. Statements with non-blank `sid`s will also override statements with the same `sid` from `source_policy_documents`.  Non-overriding statements will be added to the exported document.
    :param str policy_id: ID for the policy document.
    :param Sequence[str] source_policy_documents: List of IAM policy documents that are merged together into the exported document. Statements defined in `source_policy_documents` must have unique `sid`s. Statements with the same `sid` from `override_policy_documents` will override source statements.
    :param Sequence[pulumi.InputType['GetPolicyDocumentStatementArgs']] statements: Configuration block for a policy statement. Detailed below.
    :param str version: IAM policy document version. Valid values are `2008-10-17` and `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
    """
    ...
